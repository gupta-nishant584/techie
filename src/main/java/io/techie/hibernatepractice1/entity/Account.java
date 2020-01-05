package io.techie.hibernatepractice1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT")
public class Account {

    @Id
    @GeneratedValue
    @JsonProperty
    private long id;

    @Column(name="ACCOUNT_NUMBER")
    @JsonProperty
    private String accountNumber;

    @Column(name="BANK_NAME")
    @JsonProperty
    private String bankName;

    @Column(name="EMPLOYEE_ID", insertable = false, updatable = false)
    @JsonProperty
    private long employeeId;

    //Below Many to one mapping is a uni-direction mapping and is completely taken by care child entity.
    //OnDeleteAction.Cascade will ensure to delete all child if parent is deleted.
    //@JsonIgnore to ignore employee entity in json response otherwise GET accounts api will throw parsing exception.

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="EMPLOYEE_ID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private EmployeeEntity employeeEntity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
}
