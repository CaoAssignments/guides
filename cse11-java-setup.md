**Note:** Any recent version of Java will work for this course. The instructions below show Java 11 as an example, but Java 17, 21, or other versions are perfectly acceptable.

# Installing Java (Example: Java 11)
Navigate to the following link: [https://www.oracle.com/java/technologies/downloads/#java11](https://www.oracle.com/java/technologies/downloads/#java11)

Depending on your operating system, select one of the following:  
    <img width="396" height="68" alt="image" src="https://github.com/user-attachments/assets/b6ab4ff4-9e6c-489d-a37f-49ed8a4850a1" />

## Installing Java on Windows
1. Choose the `x64 Installer`
    <img width="1375" height="187" alt="image" src="https://github.com/user-attachments/assets/9c7dbaae-2768-48a6-9805-6e8df5a2ef4f" />

2. It will prompt you to create an Oracle account. Create one, log in, and download the executable.

3. If you receive a password validation error even though your passwords match, try creating the account in an Incognito/Private/InPrivate window.
    <img width="918" height="202" alt="image" src="https://github.com/user-attachments/assets/e3e17fb2-0307-4937-9ecf-0fb2053e5f1f" />

4. Run the executable that you just downloaded and follow through the setup wizard  
    <img width="497" height="377" alt="image" src="https://github.com/user-attachments/assets/0f500e81-6cb8-4a4e-8080-a5b545494fc7" />

5. Install it in the default directory.

6. You should now have this. You can click close:  
    <img width="498" height="377" alt="image" src="https://github.com/user-attachments/assets/16af440d-e657-4f7a-9a6e-fef4cebd45ba" />

#### Installing Java on MacOS
1. If you have a Mac with **Apple Silicon**, choose the `Arm 64 DMG Installer`

    <img width="2048" height="110" alt="image" src="https://github.com/user-attachments/assets/92f540a2-0612-4fc2-941e-7c974615b1e2" />

2. If you have a Mac with an **Intel chip**, choose `x64 DMG Installer`
    <img width="2048" height="110" alt="image" src="https://github.com/user-attachments/assets/114f32c4-c8b5-457f-b8dc-2230f275e941" />


3. It will prompt you to create an Oracle account. Create one, log in, and download the executable.

4. If you receive a password validation error even though your passwords match, try creating the account in an Incognito/Private/InPrivate window.  
    <img width="918" height="202" alt="image" src="https://github.com/user-attachments/assets/548496ea-9027-44e5-aad0-844ec68b1b5f" />


5. Open the `.pkg` installer and follow through the installation instructions

    <img width="1228" height="878" alt="image" src="https://github.com/user-attachments/assets/7ef7d384-7dac-4bbc-a525-3a0d0f2cba18" />


6. Click "Continue" and you should see this:

    <img width="1222" height="874" alt="image" src="https://github.com/user-attachments/assets/06fdbbd1-e74c-4b8e-a23c-c0fb63e92186" />


7. Provide your login credentials and click "Install". After installation, you should see the following:

    <img width="1224" height="882" alt="image" src="https://github.com/user-attachments/assets/ed34c617-c121-48f9-a947-72b51ba8897d" />


8. Click "close" and you're done!

**Note:** It's perfectly fine to see version `11.0.xx` (where `xx` is higher than `18`) in the above screenshots.

# Verify Java Installation
Open your terminal. 
- For MacOS, press Command + Spacebar, type "Terminal", and hit Enter.
- For Windows, press the Windows key, type "Terminal", and hit Enter.

Then, run the following command:  

**Linux and macOS:**
```bash
$ java -version
```

**Windows:**
```cmd
> java -version
```

You should see the Java version you're using. 

**Note:** If you run into issues when running these commands after you've 
installed Java, you may either need to:

1. Restart your terminal and run the commands again

2. Make changes to your system Path variable (though this is typically not necessary): [https://www.java.com/en/download/help/path.html](https://www.java.com/en/download/help/path.html)

Now that we have Java installed, let's try to compile and run a piece
of code from the command line.

# Installing Visual Studio Code
We will be installing Visual Studio Code (VS Code) as our IDE to modify our Java programs.
> Note: You can use any text editor (e.g., Vim, Notepad (Windows), TextEdit (macOS)) you want to edit the files in your programming assignments. You also have cloud-based options like **GitHub Codespaces**, which provides a complete development environment in your browser without requiring local installation. Do not use an Integrated Development Environment (IDE) that automatically generates source code, as 1) you need to learn how to write all source code yourself, and 2) the resulting source code often will fail to compile and/or run in Gradescope, resulting in a score of 0!

1. Navigate to this link: [https://code.visualstudio.com/download](https://code.visualstudio.com/download)

2. Download the respective executable:  
    a. For Windows:  
    <img width="538" height="638" alt="image" src="https://github.com/user-attachments/assets/47251288-7376-4f3e-986b-e22d08617194" />

    b. For macOS:  
    <img width="590" height="562" alt="image" src="https://github.com/user-attachments/assets/0c29b50d-ba53-46e5-89af-d91742ae0baa" />

3. Follow the installation instructions depending on your OS.

# Writing a small Java program  
You will create a new Java file named `Hello.java` in Visual Studio Code.

1. **Open up Visual Studio Code**  
    a. If you are using a personal computer, you can open `Visual Studio Code` like you would with a normal application.  
    b. Alternatively, if you are using the **terminal (command line),** you can type in `code` and it should open up Visual Studio Code as well (pretty neat, right?).

You should be prompted with a welcome page that looks similar to the one below:  
    <img width="1021" height="769" alt="image" src="https://github.com/user-attachments/assets/858ca7f0-6d42-449b-a29a-7ebc9f4b5772" />

2. Create your working folder!
    a. Create a dedicated folder for `CSE 11` and place it anywhere on your computer (e.g., in the Desktop).  
<img width="459" height="572" alt="image" src="https://github.com/user-attachments/assets/6705c4a0-04ad-4a6f-97d4-43d46d51c836" />


   b. Then, inside the `CSE 11` folder, create a dedicated folder for your CSE 11 Programming Assignments (e.g., `CSE 11 PAs`) to stay organized.  
<img width="1428" height="419" alt="image" src="https://github.com/user-attachments/assets/fb9f11f5-a36c-44d9-b71f-28ea6b9518c3" />


   c. Then, inside `CSE 11 PAs`, create one last folder (I promise!) for this small program to live on (e.g., `PA0`).  
   <img width="1428" height="548" alt="image" src="https://github.com/user-attachments/assets/bbeba60e-86be-4a7b-bc5c-4407ecbb46d3" />

5. Now, let's open our `PA0` folder inside VS Code so we can start programming!
    Click on the Explorer tab and select "Open Folder" in VS Code.  
    <img width="444" height="423" alt="image" src="https://github.com/user-attachments/assets/34037ce7-7630-4440-a534-b8e39fc713fc" />

6. Then navigate to the location where you stored `PA0` (e.g., Desktop → CSE 11 → CSE 11 PAs → PA0), click on `PA0` and then `Select Folder`.
<img width="1416" height="1066" alt="image" src="https://github.com/user-attachments/assets/b06d696c-9b47-46f3-a3d3-a6c39c7a146c" />

7. You should see the VS Code explorer showing the `PA0` folder (currently empty).
Click on the "New File" icon to create the file for this small program.
<img width="2880" height="1691" alt="image" src="https://github.com/user-attachments/assets/d45066e0-706b-4330-9707-6bec6b1e7b07" />

8. Name this file `Hello.java` and hit Enter. **Note that the file name starts with an Uppercase** (this is important).  
<img width="2748" height="1540" alt="image" src="https://github.com/user-attachments/assets/eb49becb-3bea-4a10-b60d-390108360ec9" />

9. Copy-paste the code below (this is called **boilerplate code**, it's code we use in all our programs to make them run!):
```java
public class Hello {
    public static void main(String[] args) {


        
    }
}
```

10. 

11. Type the contents of the screenshot below into your newly created `HelloWorld.java` file:
    <img width="774" height="330" alt="image" src="https://github.com/user-attachments/assets/cf40ace2-646e-4f0b-81fe-bff8a3880830" />

12. Then, you need to write two lines of code below `// Put your code below.`

    a. **My name is \<your name\>** starting from a new line. You'll need to use the `System.out.println` method to accomplish this. Refer to the source code line that prints out `"Hello World!"` but replace the text between the double quotation marks with `My name is <your name>`

    b. Then on another new line, tell the class what your favorite hobby is: **My favorite hobby is \<what your favorite hobby is\>**

13. Save this file by navigating to the top left-hand corner again or by pressing **Ctrl + S** (Windows) or **Cmd + S** (Mac) at the same time. 

    > **Tip:** To make your coding experience smoother, you can enable Auto Save in VS Code by going to File → Auto Save. This will automatically save your files as you type, so you don't have to worry about manually saving every time you make changes.  
    <img width="572" height="1186" alt="image" src="https://github.com/user-attachments/assets/0f8a1ba4-3924-4eea-b877-3ae106faf055" />

    You will know your new code has been saved when the white dot next to the filename at the top of the tab disappears. In the below screenshot, recent changes to `HelloWorld.java` are unsaved.  
    <img width="498" height="152" alt="image" src="https://github.com/user-attachments/assets/02da869e-fb09-460b-a22b-29ae92b83018" />

14. After that, go back to the terminal and make sure you are in the same directory where you saved your `HelloWorld.java` file. Before you run every Java code, you need to compile it first using the `javac` command.

    **Important Note:** If you make changes to a `.java` file, you will need to compile your code again before you can run the file with the updated changes.

    **Linux and macOS:**
    ```bash
    $ javac HelloWorld.java
    ```

    **Windows:**
    ```cmd
    > javac HelloWorld.java
    ```

    Notice that a brand new `.class` file appeared in your directory after compiling!  
    <img width="434" height="234" alt="image" src="https://github.com/user-attachments/assets/a25f3236-bc91-402e-b04a-632e401e9f70" />

    Then you can run the program using the `java` command.

    **Linux and macOS:**
    ```bash
    $ java HelloWorld
    ```

    **Windows:**
    ```cmd
    > java HelloWorld
    ```

    You should see three lines of output in the terminal.

    ```

# Extra: Switching between existing Java versions

If you are on a Mac and **have more than one version of Java installed**, the following steps will show you how to set the default version of Java to your preferred version (Java 11 is used as an example below).

*If you are on Windows, ask on Piazza or come to office hours. We will
provide information on this if there's demand.*

1. Run the following command:

    ```bash
    $ /usr/libexec/java_home -V
    ```

    You should see output that looks like this:

    ```
    Matching Java Virtual Machines (3):

    12.0.2, x86_64: "Java SE 12.0.2"
    /Library/Java/JavaVirtualMachines/jdk-12.0.2.jdk/Contents/Home

    11.0.2, x86_64: "Java SE 11.0.2"
    /Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home

    1.8.0_131, x86_64: "Java SE 8"
    /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home

    /Library/Java/JavaVirtualMachines/jdk-12.0.2.jdk/Contents/Home
    ```

    Please ensure that you have a Java installation (any recent version will work).

2. Pick your preferred Java version and set it to default by running the following command (Java 11 example):

    ```bash
    $ export JAVA_HOME=`/usr/libexec/java_home -v 11`
    ```

    You can also copy the exact version like this:

    ```bash
    $ export JAVA_HOME=`/usr/libexec/java_home -v 11.0.2`
    ```

    Hello World!
    My name is Kevin
    My favorite hobby is coding
    ```
