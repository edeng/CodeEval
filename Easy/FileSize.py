# Eden Ghirmai, 3/05/2014, www.codeeval.com
# Prints the amount of bytes in a given file 

import sys
import os
print os.path.getsize(sys.argv[1])