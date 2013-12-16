SELECT e.EMPLOYEE_ID, 
       e.FIRST_NAME, 
       e.LAST_NAME, 
       e.EMAIL, 
       e.PHONE_NUMBER, 
       e.HIRE_DATE, 
       e.JOB_ID, 
       e.SALARY, 
       e.COMMISSION_PCT, 
       e.MANAGER_ID, 
       e.DEPARTMENT_ID, 
       (select sum(salary)  from employees) AS Salary_All_Total, 
       (select sum(salary)  from employees where DEPARTMENT_ID = e.DEPARTMENT_ID ) AS Salary_Department_Total, 
       (select round( avg(salary))  from employees) AS Salary_Average, 
       (select count(EMPLOYEE_ID)  from employees) AS Emp_Count,
 ( select count(1) from employees where manager_id = e.employee_id) Subordinate_Count ,
(select min(salary) from employees where salary in ( select SALARY from (select  SALARY,row_number() over(order by SALARY desc nulls last) rnm
from EMPLOYEES) where rnm<=10 ) ) TopTenMin
FROM EMPLOYEES e