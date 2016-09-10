# Write your MySQL query statement below

Select Name as Customers
from Customers as C
where C.Id 
Not in
(
select CustomerId 
from  Orders
);