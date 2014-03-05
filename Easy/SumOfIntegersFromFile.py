# Eden Ghirmai, 3/05/14, www.codeeval.com
# Prints out the sum of integers read from a file.

import sys
test_cases = open(sys.argv[1], 'r')
sum = 0
for test in test_cases:
    if test:
    	sum += int(test)
print sum

test_cases.close()    	