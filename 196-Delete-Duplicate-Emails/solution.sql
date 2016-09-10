# Write your MySQL query statement below
delete from Person
where 
Id not in

(select MINId
from
(select MIN(Id) as MINId, Email
from Person
Group by Id)
)