# Eden Ghirmai, 2/18/14, www.codeeval.com
# Checks input numbers and 
# determines whether a number is even or not.
# Prints 1 if the number is even or 0 if the number is odd.

import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test: 
    	num = int(test); 
    	if num % 2 == 0:
    		print "1"; 
    	else: 
    		print "0"; 	

test_cases.close()
