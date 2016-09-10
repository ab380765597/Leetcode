# Write your MySQL query statement below

Select p.Email
from Person p
where 
p.Id not in
(select MIN(Id) as MINId, Email
from Person
Group by Email
) 