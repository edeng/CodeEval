# Eden Ghirmai, 2/18/14, www.codeeval.com
# Given two integers N and M, calculates N Mod M
# (without using any inbuilt modulus operator).

import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test: 
    	split = test.split(",")
    	first = int(split[0])
    	second = int(split[1])
    	divided = first / second
    	print first - (divided * second)

test_cases.close()

