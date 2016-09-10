# Write your MySQL query statement below
delete p from Person as p 
where 
p.Id not in

(select MINId
from
(select MIN(Id) as MINId, Email
from Person
Group by Id) as ToRemovedId
)