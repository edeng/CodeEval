# Eden Ghirmai, 2/18/14, www.codeeval.com
# Given a string, converts it into lowercase 

import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test: 
    	print(test.lower())

test_cases.close()