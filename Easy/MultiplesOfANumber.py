# Eden Ghirmai, 2/18/14, www.codeeval.com
# Given numbers x and n, where n is a power of 2,
# prints out the smallest multiple of n which is greater 
# than or equal to x. Without using division or modulo operator.

import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	if test:
		split = test.strip().split(",")
		first = int(split[0])
		second = int(split[1])
		total = 0

		while total < first: 
			total += second
	print total		

test_cases.close()		
