# Eden Ghirmai, 3/23/2014, www.codeeval.com
# Capitalizes the first letter of each word in a sentence.

import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    result = ""
    if test:
    	split = test.split()
        for word in split:
            result += word[0].upper() + word[1:] + " "

    print result.strip()            
test_cases.close()
