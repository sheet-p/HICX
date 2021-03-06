# **Simple File Parser Application**

## Responsibility of the classes

### Extension Enumeration
This enumeration lists the file extensions that the application currently supports. The application can be scaled in the future by adding mrore file types without changing any other class code.

### File
File class is responsible for storing the name, contents and the extension of a file in the application. The class has getter and setter methods for easy access.

### Directory
Directory class represents the real world entity Directory which can have sub-directories inside the directory and also a multiple files within a directory.
Directory class stores a directory along with its path (represented using a map). This class also has a list of Files. The class can be enhanced with more getter and setter methods in the future for easier access (if need be).

### Statistics
Statistics class models all different operations that can be performed on the contents of a File to get relevant stats about the file. The class currently supports:
- counting the number of words in a file
- counting number of dots in a file
- most commonly occuring word in a file
This class can be extended to add more stat calculation in the future by just adding relevant methods and the caller for them in the FileSystem class.

### FileSystem
This class encompasses all the relevant functionalities of a simple File Parser Applicaion. Following describes the currently supported functionalities of the class:
- Upon providing the path, this class identifies and creates different directories(if it does not already exist) and files.
- Upon providing the path of a file, thic class sets the conetnts of that file to the given contents.
- All the statistics of the file will be printed by this class.
- After processing of each file, the file is then copied to the "processed" subdirectory.

## Testing of the Application
JUnit tests are written to check the proper working of the application and its relelvant functionalities. This test class can be further extended in the future to add more relevant tests.
The tests are found under src/test/java/com/hicx/files/FileSystemTest.java

Custom tests can be added by starting with the pattern "/" and then any directories or subdirectories or file names. For example - "/a/b/file.txt". Custom tests can be provided in the main function or in the test class.


## How to run the application
The application can be cloned to your local and then run the main class (src/main/java/com/hicx/files/FileSystem.java).

The application is packaged using maven. If maven is installed in the local system, then run the following command after cloning the repository:
```
mvn clean test
```
This will build and run the application and test. The output of the tests can be verified in the terminal itself.
