# Eden Ghirmai, 2/18/14, www.codeeval.com
import sys
import math

def isprime(num):
	for x in range (2, int(num**0.5)+1):
		if num % x == 0:
			return False;
	return True;

sum = 0; 
for x in range(1, 1000):
	if isprime(x):
		sum += x

print sum
