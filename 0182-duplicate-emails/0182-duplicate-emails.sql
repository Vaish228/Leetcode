# Write your MySQL query statement below
select distinct p1.email as Email from Person p1 join Person p2
on p1.id <> p2.id and p1.email = p2.email;

-- select email as Email from Person
-- group by email
-- having count(email)>1;