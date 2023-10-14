#1. Find Second Highest Salary from Employee table. Return Null if doesnt Exist..
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| salary      | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
Each row of this table contains information about the salary of an employee.

# Oracle Query .. 
SELECT MAX(salary) SecondHighestSalary FROM Employee 
WHERE salary<(SELECT MAX(salary) FROM Employee);

#MySQL Query..
select (select distinct Salary from Employee order by salary desc limit 1 offset 1) as SecondHighestSalary;

#2. Find Nth Highest Salary from Employee Table..
#MYSQL Queryy..
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT(salary) from Employee order by salary DESC
      LIMIT 1 OFFSET N
  );
END

#3. Number of Unique Subjects Taught by Each Teacher
/*+-------------+------+
| Column Name | Type |
+-------------+------+
| teacher_id  | int  |
| subject_id  | int  |
| dept_id     | int  |
+-------------+------+
(subject_id, dept_id) is the primary key (combinations of columns with unique values) of this table.
Each row in this table indicates that the teacher with teacher_id teaches the subject subject_id in the department dept_id.
Write a solution to calculate the number of unique subjects each teacher teaches in the university.
Return the result table in any order.
*/
select teacher_id , count(DISTINCT subject_id) as cnt from Teacher group by teacher_id;

# 4. Select Class which is having atleast 5 students
SELECT distinct class
FROM Courses
WHERE class IN (
    SELECT class
    FROM Courses
    GROUP BY class
    HAVING COUNT(student) > 4
);
Also :- select class from Courses group by class having count(student)>4;
'Both Queries work but the one which is using where clause is faster'..

#5. Find the maximum number in table who occurs one time
select MAX(num) as num from (select num from MyNumbers group by num having count(num)=1) AS Subquery;

#6.  Managers with at Least 5 Direct Reports
    Input: 
    Employee table:
+-----+-------+------------+-----------+
| id  | name  | department | managerId |
+-----+-------+------------+-----------+
| 101 | John  | A          | None      |
| 102 | Dan   | A          | 101       |
| 103 | James | A          | 101       |
| 104 | Amy   | A          | 101       |
| 105 | Anne  | A          | 101       |
| 106 | Ron   | B          | 101       |
+-----+-------+------------+-----------+
Output: 
+------+
| name |
+------+
| John |
+------+
:--Subquery is faster than join
#Using Subquery
select e1.name from Employee e1 where e1.id in
(select e2.managerId from Employee e2 group by e2.managerId having count(e2.id)>=5);
# Using Inner Join
select e2.name from Employee e1 Inner Join Employee e2 on e1.managerId = e2.id group by e1.managerId having count(e1.id)>=5;
