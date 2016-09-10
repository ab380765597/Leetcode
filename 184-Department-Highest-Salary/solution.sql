# Write your MySQL query statement below


select MAX(e.Salary) as MAXSalary, e.Name, e.DepartmentId, e.Id, d.Name
from Employee e, Department d
group by e.DepartmentId
having Employee.DepartmentId = Department.Id