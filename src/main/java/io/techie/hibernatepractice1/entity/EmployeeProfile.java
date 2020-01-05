package io.techie.hibernatepractice1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE_PROFILE")
public class EmployeeProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Long id;

    @Column(name="GENDER")
    @JsonProperty
    private String gender;

    @Column(name="MARITAL_STATUS")
    @JsonProperty
    private String maritalStatus;

    @Column(name="PIN_CODE")
    @JsonProperty
    private String pinCode;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="EMPLOYEE_ID", nullable = false)
    private EmployeeEntity employeeEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    @Override
    public String toString() {
        return "EmployeeProfile{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", employeeEntity=" + employeeEntity +
                '}';
    }
}
