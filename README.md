# Fibonacci

The following code outputs the nth fibonacci number in 2 ways.
The first way is a regular recursive method which converts the fibonacci formula into code with no further optimization.
Due to the nature of the formula, for each fibonacci number, we need to calculate 2 other fibonacci numbers to get its value.
This results in a time complexity of O(2^n), as each iteration branches into 2 other iterations.

The second way is a more optimized version of the code which makes use of the fact that each fibonacci number has a constant value, and the previous algorithm may calculate the same value more than once. Thus, this approach uses dynamic programming to store previously calculated values in an array and uses this array to reduce the time spent on computation. This make the algorithm linear and run in O(n) time complexity, as each nth fibonacci number is only calculated once.

The code was tested on Fibonacci of 0,1,2,3,10. The code could not be tested on fibonacci of 100, 1000, and 10000 due to the imposed restriction of the inputs and outputs being integers. With inputs this large, the output exceeds the bit capacity provided by an integer and gives a negative number. 
