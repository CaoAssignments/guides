**Note:** Any recent version of Java will work for this course. The instructions below show Java 11 as an example, but Java 17, 21, or other versions are perfectly acceptable.

### Install Java (Example: Java 11)

1. Navigate to the following link: [https://www.oracle.com/java/technologies/downloads/#java11](https://www.oracle.com/java/technologies/downloads/#java11)

2. Depending on your operating system, select one of the following:

    <img width="1115" height="192" alt="image" src="https://github.com/user-attachments/assets/659a69f7-3449-4215-b135-f3d6b1e6bde1" />

3. Installation steps for **Windows**:

    a. Choose the `x64 Installer`

    <img width="1375" height="187" alt="image" src="https://github.com/user-attachments/assets/9c7dbaae-2768-48a6-9805-6e8df5a2ef4f" />


    b. It will prompt you to create an Oracle account. Create one, login, and download the executable.

    c. If you receive a password validation error even though your passwords match, try creating the account in an Incognito/Private/InPrivate window.

    <img width="918" height="202" alt="image" src="https://github.com/user-attachments/assets/e3e17fb2-0307-4937-9ecf-0fb2053e5f1f" />


    d. Run the executable that you just downloaded and follow through the setup wizard

    <img width="497" height="377" alt="image" src="https://github.com/user-attachments/assets/0f500e81-6cb8-4a4e-8080-a5b545494fc7" />


    e. Install it in the default directory

    f. You should now have this. You can click close:

    <img width="498" height="377" alt="image" src="https://github.com/user-attachments/assets/16af440d-e657-4f7a-9a6e-fef4cebd45ba" />


4. Installation steps for **MacOS**

    a. If you have a Mac with **Apple Silicon**, choose the `Arm 64 DMG Installer`

    <img width="2048" height="110" alt="image" src="https://github.com/user-attachments/assets/92f540a2-0612-4fc2-941e-7c974615b1e2" />


    b. If you have a Mac with an **Intel chip**, choose `x64 DMG Installer`
    <img width="2048" height="110" alt="image" src="https://github.com/user-attachments/assets/114f32c4-c8b5-457f-b8dc-2230f275e941" />


    c. It will prompt you to create an Oracle account. Create one, login, and download the executable.

    d. If you receive a password validation error even though your passwords match, try creating the account in an Incognito/Private/InPrivate window.
    <img width="918" height="202" alt="image" src="https://github.com/user-attachments/assets/548496ea-9027-44e5-aad0-844ec68b1b5f" />


    e. Open the `.pkg` installer and follow through the installation instructions

    <img width="1228" height="878" alt="image" src="https://github.com/user-attachments/assets/7ef7d384-7dac-4bbc-a525-3a0d0f2cba18" />


    f. Click "Continue" and you should see this:

    <img width="1222" height="874" alt="image" src="https://github.com/user-attachments/assets/06fdbbd1-e74c-4b8e-a23c-c0fb63e92186" />


    g. Provide your login credentials and click "Install". After installation, you should see the following:

    <img width="1224" height="882" alt="image" src="https://github.com/user-attachments/assets/ed34c617-c121-48f9-a947-72b51ba8897d" />


    h. Click "close" and you're done!

**Note:** It's perfectly fine to see version `11.0.xx` (where `xx` is higher than `18`) in the above screenshots.

### Toggling Between Installed Java Versions

If you are on Mac and have more than one version of Java installed, the
following steps will show you how to set the default version of Java to
your preferred version (Java 11 is used as an example below).

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

### Verify Java Installation

Now you should have Java configured, but how can you verify this?

Open your terminal and navigate to a directory where you'd like to work. 

**Tip:** Consider creating a dedicated folder for your CSE 11 work, such as `CSE11` in your Desktop or Documents folder, to keep your assignments organized.

Then, run the following command:

**Linux and macOS:**
```bash
$ java -version
```

**Windows:**
```cmd
> java -version
```

You should see the Java version now. 

**Note:** If you run into issues when running these commands after you've 
installed Java, you may either need to:

1. Restart your terminal and run the commands again

2. Make changes to your system Path variable (though this is typically not necessary): [https://www.java.com/en/download/help/path.html](https://www.java.com/en/download/help/path.html)

Now that we have Java installed, let's try to compile and run a piece
of code from the command line.

### Visual Studio Code

You can use any text editor (e.g., Vim, Notepad (Windows), TextEdit
(macOS)) you want to edit the files in your programming assignments. You
also have cloud-based options like **GitHub Codespaces**, which provides a
complete development environment in your browser without requiring local
installation. Do not use an Integrated Development Environment (IDE) that
automatically generates source code, as 1) you need to learn how to write
all source code yourself and 2) the resulting source code often will fail
to compile and/or run in Gradescope, resulting in a score of 0! Here, we
will be installing Visual Studio Code (VS Code), a lightweight, great
text editor. You can install VS Code by following the link below.

1. Navigate to this link: [https://code.visualstudio.com/download](https://code.visualstudio.com/download)

2. Download the respective executable:

    a. For Windows:

    <img width="538" height="638" alt="image" src="https://github.com/user-attachments/assets/47251288-7376-4f3e-986b-e22d08617194" />


    b. For macOS:

    <img width="590" height="562" alt="image" src="https://github.com/user-attachments/assets/0c29b50d-ba53-46e5-89af-d91742ae0baa" />


3. Follow the installation instructions depending on your OS.

### Your First Java Program

You will create a new Java file named `HelloWorld.java` in Visual Studio Code.

1. Open up Visual Studio Code.

    a. If you are using a personal computer, you can open `Visual Studio Code` like you would with a normal application.

    b. Alternatively, if you are using the **terminal (command line),** you can type in `code` and it should open up Visual Studio Code as well (pretty neat right?).

2. You should be prompted with a page that looks similar to the one below:

    <img width="1021" height="769" alt="image" src="https://github.com/user-attachments/assets/858ca7f0-6d42-449b-a29a-7ebc9f4b5772" />


3. Let's navigate to a folder where you'd like to work on your assignment!

    **Tip:** We recommend creating a dedicated folder for your CSE 11 programming assignments to stay organized. For example, create a folder called `CSE11` on your Desktop or in your Documents folder.

    Click on the Explorer tab and select "Open Folder" in VS Code to locate your desired directory.

    <img width="444" height="423" alt="image" src="https://github.com/user-attachments/assets/34037ce7-7630-4440-a534-b8e39fc713fc" />


4. We should be able to see our file explorer on the left-hand side.

    [![VS Code File Explorer](img/16.png)](https://github.com/CaoAssignments/cse11-fa25-pa0-helloworld-starter/raw/main/img/16.png)

5. Next, on the VS Code toolbar at the top, select Terminal → New Terminal.

    [![VS Code Terminal Menu](img/17.png)](https://github.com/CaoAssignments/cse11-fa25-pa0-helloworld-starter/raw/main/img/17.png)

6. You just opened up the terminal (command line) in VS Code.

    <img width="725" height="184" alt="image" src="https://github.com/user-attachments/assets/6109c352-ae4f-4d16-a346-6178a811f741" />


7. Now let's create a Java file called `HelloWorld.java`. You can do this either from the terminal we just opened or by simply using VS Code.

    a. **Terminal**
    
    Create the `HelloWorld.java` file using terminal commands:
    - Mac/Linux: `touch HelloWorld.java`
    - Windows: `type nul > HelloWorld.java`
    <img width="1316" height="278" alt="image" src="https://github.com/user-attachments/assets/24f3930c-97d8-4c82-b517-52a2d167bdc0" />


    b. **VS Code**

    Use the `add file` icon.

    <img width="536" height="234" alt="image" src="https://github.com/user-attachments/assets/d84ed7bc-61fb-4180-aae4-0edd7c22f3f6" />


    Name the file.

    <img width="532" height="264" alt="image" src="https://github.com/user-attachments/assets/e243d9d6-3f1b-4359-b7d6-a92bc199dd8b" />


8. Type the contents of the screenshot below into your newly created `HelloWorld.java` file:

    <img width="774" height="330" alt="image" src="https://github.com/user-attachments/assets/cf40ace2-646e-4f0b-81fe-bff8a3880830" />


9. Then, you need to write two lines of code below `// Put your code below`

    a. **My name is \<your name\>** starting from a new line. You'll need to use the `System.out.println` method to accomplish this. Refer to the source code line that prints out `"Hello World!"` but replace the text between the double quotation marks with `My name is <your name>`

    b. Then on another new line, tell the class what your favorite hobby is: **My favorite hobby is \<what your favorite hobby is\>**

10. Save this file by navigating to the top left-hand corner again or by pressing **Ctrl + S** (Windows) or **Cmd + S** (Mac) at the same time. 

    **Tip:** To make your coding experience smoother, you can enable Auto Save in VS Code by going to File → Auto Save. This will automatically save your files as you type, so you don't have to worry about manually saving every time you make changes.

    <img width="572" height="1186" alt="image" src="https://github.com/user-attachments/assets/0f8a1ba4-3924-4eea-b877-3ae106faf055" />


    You will know if your new code is saved when the white dot next to the filename at the top of the tab disappears. In the below screenshot, recent changes to `HelloWorld.java` are unsaved.

    <img width="498" height="152" alt="image" src="https://github.com/user-attachments/assets/02da869e-fb09-460b-a22b-29ae92b83018" />


11. After that, go back to the terminal and make sure you are in the same directory where you saved your `HelloWorld.java` file. Before you run every Java code, you need to compile it first using the `javac` command.

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
    Hello World!
    My name is Kevin
    My favorite hobby is coding
    ```
