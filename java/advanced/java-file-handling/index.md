## Java File Handling

In this post we are going to learn the basics of Java file handling or Java I/O. Understanding how files are handle in Java is very important. In real life applications, you get this requirement, read to or write to files in your application. 

Note, usually when you work with files or Java I/O (input and output), you basically use try, catch block to handle exceptions and use the mechanism to free up resources or closing files at the end. Hence, we will also go through those steps, for simplicity, we write simple code first without using try, catch block.


## Read Content From Files

In this examples java class, we see how to read content from text file. There are several methods in java.io package to read from a file. Such as, FileReader, BufferedReader etc. for reading files and method called read() are used to read files. And the File class is used to set the destination file (path of the file). Here for simplicity, we will use FileReader class to read file (character by character)


Note: guess, you have a file called **hello.txt** with the following quote: "Programming is the art of algorithm design and the craft of debugging errant code."

So, let's write a simple file reading example where we read a file character by character.

**FileReaderExample.java**

```
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) throws IOException {
        //Path of the file
        File file = new File("demo.txt");
        //Using FileReader
        FileReader reader = new FileReader(file);

        //read character by character
        int character;
        while ((character = reader.read()) != -1){
            System.out.print((char) character);
        }
    }
}
```

If you now run the above example, you see the quote in the console.

```
Programming is the art of algorithm design and the craft of debugging errant code.
```

Instead of reading file character by character, we can also read a file line by line using **BufferedReader** with the combination of **FileReader** class. 

Let's update your demo.txt file by one more quote: 

**demo.txt file**

```
Programming is the art of algorithm design and the craft of debugging errant code.
Experience is the name everyone gives to their mistakes.
```

```
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) throws IOException {
        //Path of the file
        File file = new File("demo.txt");
        //Using FileReader
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = fileReader.readLine()) != null){
            System.out.println(line); //it will read each line of the file
        }
    }
}
```

Output in the console:

```
Programming is the art of algorithm design and the craft of debugging errant code.
Experience is the name everyone gives to their mistakes.
```

## Write to files

Here we will use **FileWriter** class in order to write something (simple text) into a file. And if file does not exist, it will be generated automatically with the content.

Note: Besides, FileWriter class, you can also use BufferedWriter, PrintWriter or FileOutputStream can also be used to write in a file. For simplicity (if proficiency matters, always use BufferedWriter) we use here FileWriter class.

Let's see the following **FileWriterExample.java** class. Note that, you must close the FileWriter resource in order to write to it. So, we use here try-with-resources for automatic FileWriter close up.

**FileWriter.java**

```
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {

        File file = new File("quote.txt");
        String quote = "Experience is the name everyone gives to their mistakes.";

        //write to the file using try-with resources (recommended)
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(quote);
            System.out.println("Quote has been added.");
        } catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
```

You can see now, in your root directory, a file is generated called **quote.txt**, just open it and you will see the following quote.

**quote.txt**

```
Experience is the name everyone gives to their mistakes.
```

Just guess that, you want to add another quote in this text file. Just use Boolean property - true as a second parameter in the **FileWriter** constructor.

```
FileWriter writer = new FileWriter(file, true);  // 'true' enables appending new content
```

Otherwise, the above java file will overwrite the previous content if the file exists and have content.

