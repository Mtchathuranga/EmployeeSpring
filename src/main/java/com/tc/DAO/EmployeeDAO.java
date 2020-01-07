package com.tc.DAO;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class EmployeeDAO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="employee_id")
    private Integer id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="dep_id")
    private Integer depID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getDepID() {
        return depID;
    }

    public void setDepID(Integer depID) {
        this.depID = depID;
    }



}
