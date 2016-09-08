# Write your MySQL query statement below
Select p.FirstName, p.LastName, a.City, a.State 
From Person p left out join Address a
on Person.PersonId = Address.PersonId;