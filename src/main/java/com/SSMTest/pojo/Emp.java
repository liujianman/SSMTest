package com.SSMTest.pojo;
public class Emp {
    private Integer empId;
    private String empName;
    private String gender;
    private String email;
    private Integer dId;
    public Emp() {
        super();
    }
    public Emp(Integer empId,String empName,String gender,String email,Integer dId) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }
    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDId() {
        return this.dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

}
