# Write your MySQL query statement below
-- select p1.email as Email from Person p1 join Person p2
-- on p1.id = p2.id
-- where p1.

select email as Email from Person
group by email
having count(email)>1;