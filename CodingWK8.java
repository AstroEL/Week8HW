
public class CodingWK8 {
/*
 * 
 *	Write queries to address the following business needs.
 *
 *	1. I want to know how many employees with each title were born after 1965.
 
 		SELECT t.title AS "Title", count(e.emp_no) AS "# OF EEs" FROM employees e	
		INNER JOIN titles t
		ON t.emp_no = e.emp_no
		WHERE e.birth_date >= "1965-01-01"
		GROUP BY t.title;
 	
 	
 *	2. I want to know the average salary per title.
 
		SELECT t.title AS "Title" ,avg(s.salary) AS "Average Salary" from employees e 
		INNER JOIN titles t
		ON t.emp_no = e.emp_no
		INNER JOIN salaries s 
		ON s.emp_no = t.emp_no
		GROUP by t.title;
		
 *	3. How much money was spent on salary for the marketing department between the years 1990 and 1992?
 
 		SELECT d.dept_name AS "Department", FORMAT(SUM(s.salary), 2) 
		AS "Total Salary Spent - 1990-1992"
		FROM departments d
		JOIN dept_emp p ON p.dept_no = d.dept_no
		INNER JOIN salaries s ON s.emp_no = p.emp_no
		WHERE d.dept_name = "Marketing"
		AND s.from_date >= "1990-01-01"
		AND s.to_date < "1993-01-01";
 
 */
	
 
	
}
