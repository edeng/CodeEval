# Eden Ghirmai, 3/9/2014, www.codeeval.com
# You are given a string 'S' and a character 't'. 
#Print out the position of the rightmost occurrence of 't' 
# (case matters) in 'S' or -1 if there is none.
import sys

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    both = test.rstrip().split(",");
    print both[0].rfind(both[1])

test_cases.close()