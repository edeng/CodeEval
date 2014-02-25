import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test:
        current = test.split()
        result = ""
        length = len(current) - 1
        for x in range(len(current)):
            result += current[-x - 1] + " "

    	print result.strip()
test_cases.close()
