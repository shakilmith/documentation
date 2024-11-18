# Before appending texts
with open("demo.txt", "r") as file:
    print(file.read()) # read file, previous version

# append texts with mode a and write function
with open("demo.txt", "a") as file:
    file.write("This is new appended text.\n") # append new content

# reading after appending new texts
with open("demo.txt", "r") as file:
    print(file.read().strip())