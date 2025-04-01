We’ll be using **OpenJDK 17** as our grading environment. For maximum compatibility, please make sure you are using JDK 17 locally. However, you are free to use any IDEs you want (but you should not use any AI-assisted code completion plugins).

# Initial Setup

### For macOS

_(For Windows, skip to the section below)_

1.  Check if you have the up-to-date Java installed.

    Type the following command in your Terminal:

    ```shell
    java -version
    ```

    The output of the above command should give: `java version “X.X.X.X”`, where X.X.X.X specifies the version number. If your Java version is not 17.x.x.x, then you need to get the updated version. If an error gets produced saying there is “No Java runtime present”, then you have to perform a fresh installation.

2.  Download Java.

    _You may follow this [guide](https://support.apple.com/en-us/HT211814#:~:text=To%20open%20About%20This%20Mac,as%20an%20Intel%2Dbased%20Mac.) if you can’t tell if your Mac is Intel-based or Apple Silicon-based._

    - For Macs with Intel processors, use [https://download.oracle.com/java/17/archive/jdk-17_macos-x64_bin.dmg](https://download.oracle.com/java/17/archive/jdk-17_macos-x64_bin.dmg).
    - For Macs with Apple Silicon processors (M1/M2/M3/M4), [https://download.oracle.com/java/17/archive/jdk-17_macos-aarch64_bin.dmg](https://download.oracle.com/java/17/archive/jdk-17_macos-aarch64_bin.dmg).

3.  When you’ve finished the download, click it and follow the installer. You might also have to double click the box (shown in the first photo below) to start the installer (you can keep the default options).

<img src="https://user-images.githubusercontent.com/12138874/224300834-78e20301-8a06-4f4d-9927-41d081a6b4eb.png" height="300"><img src="https://user-images.githubusercontent.com/12138874/224300859-08f22d6b-e5f1-44ce-b0cb-891098e90e73.png" height="300">

4.  Re-run the following command in your terminal to ensure you have the correct version.

        java -version

    It should now give you a version number that is **17.x.x.x**.

    If it still shows a different version, then run the following command:

        /usr/libexec/java_home -V

    This will list out all installed versions of Java. Find the version 17.x.x.x and copy the code to set the JAVA_HOME environment variable:

        export JAVA_HOME=`/usr/libexec/java_home -v 17.x.x.x

    Rerun `java -version` to verify that the version is now Java 17.x.x.x.

### For Windows

1.  Check if you have the up-to-date Java installed.

    Type the following command in your Command Prompt:

        java -version

    The output of the above command should give: `java version X.X.X`, where X.X.X specifies the version number. If your Java version is not 17.x.x.x, then you need to get the updated version. If an error gets produced saying there is “No Java runtime present”, then you have to perform a fresh installation.

2.  Download Java: [https://download.oracle.com/java/17/archive/jdk-17_windows-x64_bin.exe](https://download.oracle.com/java/17/archive/jdk-17_windows-x64_bin.exe)
3.  When you’ve finished the download, click it and follow the installer.

4.  Re-run `java -version` to verify that you have the correct version. If you do not get version 17.x.x.x, follow the instructions under step 5 to set the JDK Path to 17.x.x.x.
5.  Type `javac` in the command prompt and see the output. If you get `javac is not recognized as an internal or external command`, this means the JDK Path is not set. To set it:

    1.  Find the location of your Java folder (by default Java is installed in `C:\Program Files\Java`).  Go to the Java folder, and then go into the bin folder, which is inside the Java folder (by default `bin` can be found at `C:\Program Files\Java\jdk-17.x.x.x`). In the bin folder, you should see the files `javac.exe` and `java.exe`.  Highlight the path and copy it as shown below.

    ![explorer_4AhtNeuZsq](https://user-images.githubusercontent.com/12138874/224301061-a35a2b69-ddcd-47b7-b58e-88ad38f9397c.gif)

    2.  In explorer, right-click on “This PC”, and select “Properties”.
    3.  Scroll down to find “Advanced System Settings”.
    4.  Open “Environment Variables”, select the variable named ‘Path’ and press ‘Edit’ under the ‘User Variables for xxx’ section to edit the Path environment variable.
    5.  Click New and paste the path (e.g., `C:\Program Files\Java\jdk-11.0.5\bin`) to your Java bin folder. Click OK.

        ![ezgif-1-bffa6d014d](https://user-images.githubusercontent.com/12138874/224301146-5766b532-74ad-4dfa-ab76-827cd7bafc5d.gif)

    6.  Finally, open a **new** command prompt window again and type `javac`. You should see something like below.

        ```

        \> javac
        Usage: javac <options> <source files>
        where possible options include:
        ...
        ```

# Writing your program in an IDE

1.  Download and install VS Code ([https://code.visualstudio.com](https://code.visualstudio.com)). You can keep all the default options.
2.  Create a new folder on your preferred location (e.g Desktop, Documents) to save our files.
3.  Open the folder you just created by clicking “File” - “Open Folder”, and then proceed to select the folder you just created.
4.  Create a new file by clicking “File” - “New Text File”, and then type the following HelloWorld program in the text editor.

    ```
    /**
     * Name: Qingyang Hu
     * Email: q3hu@ucsd.edu
     * PID: A16164360
     * This is an example Java file to demonstrate how to print
     * a message to standard output.
     */

    /**
     * This is the class for our HelloWorld program. You may modify the message by
     * changing the MESSAGE variable.
     */
    public class HelloWorld {
        private final static String MESSAGE = "Hello World!";
        /**
         * This is the main method of the program, and it'll print a Hello World
         * message to standard output.
         * @param args not used in this program
         */
        public static void main(String[] args) {
            System.out.println(MESSAGE);
        }
    }
    ```

5.  Once you’re done typing, choose “File” then “Save” then change type to “Java” and save the file as HelloWorld.java.

    ![ezgif-1-40e1001e1c](https://user-images.githubusercontent.com/12138874/224301407-fc676179-8afb-4b23-8b0c-52f062038aa9.gif)

# Compiling and executing your program

1.  In VS Code, click on the Explorer icon on the top left to see the files. Then right click on “HelloWorld.java”, and click on “Open in Integrated Terminal”.

    ![image](https://user-images.githubusercontent.com/12138874/224301380-4b8bfd8c-e48e-4141-83fd-554442e4e0e0.png)

2.  Type the following in your Terminal to compile your code:

        javac HelloWorld.java

    You should not see any error messages. This will produce a file named `HelloWorld.class`, which will store information about the file you just compiled.

3.  Finally, to run the file, type the following (make sure you do not add the “.class” part at the end of the file name):

        java HelloWorld

    You should see “Hello World!” printed in your Terminal.
