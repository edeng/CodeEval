# Eden Ghirmai, 3/09/14, www.codeeval.com
# Finds the first non repeated character in a string.

import sys

def check(phrase):
    for x in range(0, len(phrase)):
		c = test[x]
		before = test[:x]
		after = test[x+1:]
		if (before.find(c) == -1 and after.find(c) == -1):
			return c
    return         


test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test: 
    	print check(test)
    		
test_cases.close()
