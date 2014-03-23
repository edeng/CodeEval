# Eden Ghirmai, 3/22/2014, www.codeeval.com
# Finds the longest word in a sentence and prints it
# If a sentence has more than one word of the same length, first one is picked
# Does this for every line

import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test:
    	split = test.split()
    	max_word = ""
    	for word in split:
    		if len(max_word) < len(word):
    			max_word = word
    print max_word			
test_cases.close()    	