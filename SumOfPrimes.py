# Eden Ghirmai, 2/18/14, www.codeeval.com
import sys
import math

print int(2.5); 



def isprime(num):
	for x in range (3, int(math.sqrt(num)) + 1, 2):
		if num % x == 0:
			return False;
	return True;

print isprime(11); 	

sum = 0; 
for x in range(1, 1000):
	if isprime(x):
		sum += x

print sum
