# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e join Department d
on e.departmentId = d.id
where (e.salary, e.departmentId) IN (
select Max(Salary), DepartmentId from Employee group by departmentId );