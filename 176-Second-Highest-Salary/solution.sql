# Write your MySQL query statement below
select top (1) Salary 
from (
    select top (2) Salary
    from Employee
    order by Salary DESC
)As Emp Order by Salary;
