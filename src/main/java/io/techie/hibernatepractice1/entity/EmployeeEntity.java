package io.techie.hibernatepractice1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Long id;

    @Column(name="FIRST_NAME")
    @JsonProperty
    private String firstName;

    @Column(name="LAST_NAME")
    @JsonProperty
    private String lastName;

    @Column(name="EMAIL")
    @JsonProperty
    private String email;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "employeeEntity")
    @JsonProperty
    private EmployeeProfile employeeProfile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeProfile getEmployeeProfile() {
        return employeeProfile;
    }

    public void setEmployeeProfile(EmployeeProfile employeeProfile) {
        this.employeeProfile = employeeProfile;
    }
}
