
public class Research {
/*
 *	Look up 10 different SQL functions supported by MySQL that were not discussed in the video curriculum.
 *	COUNT()
 *	MIN()
 *	MAX()
 *	AVG()
 *	CONCAT()
 *	
 *
 *	Explain what they do and how they are used. 
 *	Write a query using each of the 10 functions. (10 queries, one for each function).
 *
 */
	
/*	DISCLAIMER: I was unsure if the queries needed to be for our actual downloaded database or
 * 	if I could go full imaginary = so on most I went full imaginary. 
 * 
 * 	1)	FORMAT() 
 * 			Format takes a number and another that will specify how many decimal places this
 * 			function will return. It then returns the result as a string. 
 *	 		SYNTAX: FORMAT(NUMBER, #ofDecimals)
 * 			EXAMPLE: SELECT FORMAT(4521635.654654, 2);
 * 
 * 	2)	CHAR_LENGTH()
 * 			This function returns the length of the string selected. It does so in characters. 
 * 			SYNTAX: CHAR_LENGTH(String)
 * 			EXAMPLE: SELECT CHAR_LENGTH("Bippity Boppity Boop") AS LengthOfQuote FROM Quotes;
 * 
 * 	3)	UCASE()
 * 			Easy enough - converts a specified string to upper-case. Can also use the UPPER() 
 * 			function.
 * 			SYNTAX: UCASE(text)
 * 			EXAMPLE: SELECT UCASE("i love sunsets and long walks on the canal");
 * 					 SELECT UCASE(CustomerName) AS UppercaseCustomerName FROM Customers;
 * 
 * 	4)	TRIM()
 * 			Trim function removes leading and trailing spaces from a string - you have to include
 * 			a string parameter in the function. 
 * 			SYNTAX: TRIM(String)
 * 			EXAMPLE: SELECT TRIM("      NO COOTIES ALLOWED     ") AS TrimmedString;
 * 
 * 	5)	REVERSE()
 * 			Reverses a string and returns the result! HELLO > OLLEH
 * 			SYNTAX: REVERSE(String)
 * 			EXAMPLE: SELECT REVERSE("REDRUM"); 
 * 
 * 	6)	GREATEST()
 * 			This function returns the greatest value in a list of expressions.
 * 			SYNTAX: GREATEST(expression1, expr2, expr3, ...)
 * 			EXAMPLE: SELECT GREATEST(12, 13, 165, 13, 1654);
 * 					 SELECT GREATEST(Salary) AS "TOP DAWG" FROM Salaries;
 * 
 * 	7)	LEAST()
 * 			And quite intuitively - this function returns the least value in a list of expressions. 
 * 			SYNTAX: LEAST(expression1, expr2, expr3, ...)
 * 			EXAMPLE: SELECT LEAST(3, 6, 9, 12, 15);
 * 
 * 	8)	TIME()
 * 			Function that can extract the time value from a date/time expression. If the expression
 * 			is not a time or a date/time, this function will return "00:00:00" and if it is NULL the 
 * 			function will also return NULL. 
 * 			SYNTAX: TIME(expression)
 * 			EXAMPLE: SELECT TIME("2018-08-10 14:35:10");
 * 
 * 	9)	NOW()
 * 			Function that returns the current date and time! Ah ha! 
 * 			SYNTAX: NOW();
 * 			EXAMPLE: SELECT NOW();
 * 
 * 	10)	REPLACE()
 * 			This one replaces all occurrences of a specified string. Careful because it is case-sensitive.
 * 			SYNTAX: REPLACE(string, from_substring, to_substring)
 * 			EXAMPLE: REPLACE("I like turtles", "A", "B");
 * 			
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
