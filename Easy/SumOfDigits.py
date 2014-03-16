# Eden Ghirmai, 3/15/2014, www.codeeval.com
# Given a positive integer, finds the sum of its constituent digits.
import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test:
    	num = int(test)
    	sum = 0
    	while num != 0:
    		sum += num % 10
    		num /= 10
    	print sum	
test_cases.close()    	