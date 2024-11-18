Built-in Exceptions

Arithmetic Exceptions
ZeroDivisionError: Raised when attempting to divide by zero.
OverflowError: Raised when a calculation exceeds the maximum limit for a numeric type.
FloatingPointError: Raised for floating-point errors, though rarely used.
Assertion and Attribute Errors
AssertionError: Raised when an assert statement fails.
AttributeError: Raised when an attribute reference or assignment fails (e.g., accessing a nonexistent attribute).
Buffer and Import Errors
BufferError: Raised when an operation on a buffer object fails.
ImportError: Raised when an import statement fails.
ModuleNotFoundError: A subclass of ImportError, raised when a module is not found.
IO and OS Errors
FileNotFoundError: Raised when trying to access a file that doesn’t exist.
PermissionError: Raised when trying to perform an operation without proper permissions.
IsADirectoryError: Raised when a file operation is attempted on a directory.
NotADirectoryError: Raised when a directory operation is attempted on a file.
OSError: A general category for operating system-related errors (e.g., disk issues, invalid file operations).
Key, Index, and Type Errors
KeyError: Raised when a dictionary key is not found.
IndexError: Raised when trying to access an invalid index in a sequence (e.g., list, tuple).
TypeError: Raised when an operation is performed on an incompatible type (e.g., adding a string to an integer).
Value and Lookup Errors
ValueError: Raised when a function receives an argument of the right type but an invalid value (e.g., int("abc")).
LookupError: The base class for errors raised when a lookup operation fails (e.g., KeyError, IndexError).
Name and Reference Errors
NameError: Raised when a variable or function name is not found in the local or global scope.
UnboundLocalError: A subclass of NameError, raised when a local variable is referenced before assignment.
Memory and Recursion Errors
MemoryError: Raised when an operation runs out of memory.
RecursionError: Raised when the maximum recursion depth is exceeded.
System and Runtime Errors
SystemError: Raised when the Python interpreter encounters an internal error but the program can still run.
RuntimeError: A general error category for runtime errors not covered by other exceptions.
Stop Iteration Errors
StopIteration: Raised to indicate the end of an iterator (e.g., using next() on an exhausted iterator).
StopAsyncIteration: Raised to indicate the end of an asynchronous iterator.
Syntax and Indentation Errors
SyntaxError: Raised when the parser encounters invalid syntax.
IndentationError: Raised when the code is not indented properly.
TabError: A subclass of IndentationError, raised for inconsistent use of tabs and spaces.
Environment Errors
EnvironmentError: A base class for I/O-related errors (now mostly replaced by OSError).
EOFError: Raised when the input() function hits an end-of-file condition.
Connection Errors
ConnectionError: A base class for connection-related errors.
BrokenPipeError: Raised when a pipe or socket is broken.
ConnectionAbortedError: Raised when an established connection is aborted.
ConnectionRefusedError: Raised when a connection attempt is refused.
ConnectionResetError: Raised when a connection is reset by the peer.
Other Common Exceptions
TimeoutError: Raised when a system function times out.
UnicodeError: Raised for Unicode-related encoding/decoding issues.
UnicodeEncodeError: Raised during encoding failures.
UnicodeDecodeError: Raised during decoding failures.
UnicodeTranslateError: Raised during translation failures.
NotImplementedError: Raised when an abstract method is not implemented in a subclass.
KeyboardInterrupt: Raised when the user interrupts the program execution (e.g., pressing Ctrl+C).
SystemExit: Raised when the sys.exit() function is called.
These exceptions cover a wide range of error conditions in Python. You can handle them using try-except blocks and even define your own exceptions by subclassing the Exception class.