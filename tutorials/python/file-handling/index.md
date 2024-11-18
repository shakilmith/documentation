# File Handling in Python

File handling in python means **creating**, **reading**, **writing to** or **deleting** files in python.

## File Modes

First of all let me recognize you the file modes, while working with files in python. Such as,

**r:** Read (default). File must exist.
**w:** Write. Creates or overwrites the file.
**a:** Append. Adds to the file if it exists.
**x:** Exclusive creation. Fails if file exists.
**b:** Binary mode. Use with r, w, etc.
**t:** Text mode (default).

## Methods Usually Use While Working With Files

open: Open the file
read: read the file
write: write to the file
remove: delete or remove the file, external **os** module is required

**Note:** The above functions, required one of the mentioned modes. Such as, for creating file require **"w"** or **"a*** mode. Read function requires **"r"** mode, delete a file requires **"os"** module etc.


## Creating and Writing to a File

```
# Create a file or overwrite if it exists
with open("demo.txt", "w") as file: # can be written: file = open("demo.tx", "w")
    file.write("Hello, this is my demo file.\n")
```

Now, demo.txt file has been created in the root folder, with the following texts.

```
Hello, this is my demo file.
```

## Reading File

As we have earlier created demo.txt file in the root folder. So, if we want to read the file and output to the console, we have to use read function including "r" mode. Such as

```
# read (demo.txt) entire content
with open("demo.txt", "r") as file:
    print(file.read()) # it will read the entire file content
 
# read file (demo.txt) line by line   
with open("demo.txt", "r") as file:
    for line in file: # using for loop we can read file line by line
        print(line.strip()) # Strip removes trailing newline characters
```

The output in the console:

```
Hello, this is my demo file.

Hello, this is my demo file.
```

## Write to Existing File (Append Texts)

The "a" mode can be used to append texts in a file (if it exists). Such as, 

```
# Before appending texts
with open("demo.txt", "r") as file:
    print(file.read()) # read file, previous version

# append texts with mode a and write function
with open("demo.txt", "a") as file:
    file.write("This is new appended text.\n") # append new content

# reading after appending new texts
with open("demo.txt", "r") as file:
    print(file.read().strip())
```

Output:

```
Hello, this is my demo file.

Hello, this is my demo file.
This is new appended text.
```

**Note:** Always better to raise exception or use if-else statement if file does not exists.


## Remove or Delete a File

Required external module called os.

```
import os

# Delete a file
if os.path.exists("demo.txt"):
    os.remove("demo.txt") # remove the demo.txt file
    print("demo.txt file has been deleted.") # print a successful message
else:
    print("File does not exist.") # print this if file doesn't exists
```

Output:
```
demo.txt file has been deleted.
```


## Know More

**keyword with**

The "with" statement is used to wrap the execution of a block with methods defined by a context manager (see section With Statement Context Managers). This allows common "try"…"except"…"finally" usage patterns to be encapsulated for convenient reuse.

**Open Function**

Open function is used to open file and return a stream.  Raise OSError upon failure.

file is either a text or byte string giving the name (and the path
if the file isn't in the current working directory) of the file to
be opened or an integer file descriptor of the file to be
wrapped. (If a file descriptor is given, it is closed when the
returned I/O object is closed, unless closefd is set to False.)

**open()** returns a file object whose type depends on the mode, and
through which the standard file operations such as reading and writing
are performed. When open() is used to open a file in a text mode ('w',
'r', 'wt', 'rt', etc.), it returns a TextIOWrapper. When used to open
a file in a binary mode, the returned class varies: in read binary
mode, it returns a BufferedReader; in write binary and append binary
modes, it returns a BufferedWriter, and in read/write mode, it returns
a BufferedRandom.

Link: know more