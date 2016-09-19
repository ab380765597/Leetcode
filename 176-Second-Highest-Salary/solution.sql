# Write your MySQL query statement below
select top 1 SAL 
from (
    select top 2 Salary as SAL
    from Employee
    order by Salary DESC
);
