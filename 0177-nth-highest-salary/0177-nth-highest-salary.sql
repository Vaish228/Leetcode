CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
        SELECT DISTINCT salary AS NthHighestSalary
        FROM Employee e1
        WHERE (
        SELECT COUNT(DISTINCT salary)
        FROM Employee e2
        WHERE e2.salary > e1.salary
        ) = N - 1
  );
END