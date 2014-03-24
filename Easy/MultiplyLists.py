# Eden Ghirmai, 3/24/2014, www.codeeval.com
# Takes 2 lists of integers and multiplies 
# corresponding elements in the lists

import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test:
    	both = test.split("|")
    	left = both[0].split()
    	right = both[1].split()
    	result = ""
    	for x in range(0, len(left)):
    		result += str(int(left[x]) * int(right[x])) + " "
    	
    	print result.strip()			
test_cases.close()    	