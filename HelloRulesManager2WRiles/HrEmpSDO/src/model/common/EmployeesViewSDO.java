package model.common;

public interface EmployeesViewSDO extends java.io.Serializable {

   public java.lang.Integer getEmployeeId();

   public void setEmployeeId(java.lang.Integer value);

   public java.lang.String getFirstName();

   public void setFirstName(java.lang.String value);

   public java.lang.String getLastName();

   public void setLastName(java.lang.String value);

   public java.lang.String getEmail();

   public void setEmail(java.lang.String value);

   public java.lang.String getPhoneNumber();

   public void setPhoneNumber(java.lang.String value);

   public java.sql.Timestamp getHireDate();

   public void setHireDate(java.sql.Timestamp value);

   public java.lang.String getJobId();

   public void setJobId(java.lang.String value);

   public java.math.BigDecimal getSalary();

   public void setSalary(java.math.BigDecimal value);

   public java.math.BigDecimal getCommissionPct();

   public void setCommissionPct(java.math.BigDecimal value);

   public java.lang.Integer getManagerId();

   public void setManagerId(java.lang.Integer value);

   public java.lang.Integer getDepartmentId();

   public void setDepartmentId(java.lang.Integer value);

   public java.math.BigDecimal getSalaryalltotal();

   public void setSalaryalltotal(java.math.BigDecimal value);

   public java.math.BigDecimal getSalarydepartmenttotal();

   public void setSalarydepartmenttotal(java.math.BigDecimal value);

   public java.math.BigDecimal getSalaryAverage();

   public void setSalaryAverage(java.math.BigDecimal value);

   public java.math.BigDecimal getCountEmployees();

   public void setCountEmployees(java.math.BigDecimal value);

   public java.math.BigDecimal getSubordinatecount();

   public void setSubordinatecount(java.math.BigDecimal value);

   public java.math.BigDecimal getToptenmin();

   public void setToptenmin(java.math.BigDecimal value);


}

