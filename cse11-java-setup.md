**Note:** Any recent version of Java will work for this course. The instructions below show Java 11 as an example, but Java 17, 21, or other versions are perfectly acceptable.

# Installing Java (Example: Java 11)
Navigate to the following link: [https://www.oracle.com/java/technologies/downloads/#java11](https://www.oracle.com/java/technologies/downloads/#java11)

Depending on your operating system, select one of the following:  
    <img width="396" height="68" alt="image" src="https://github.com/user-attachments/assets/b6ab4ff4-9e6c-489d-a37f-49ed8a4850a1" />

## Installing Java on Windows
1. Choose the `x64 Installer`
    <img width="1375" height="187" alt="image" src="https://github.com/user-attachments/assets/9c7dbaae-2768-48a6-9805-6e8df5a2ef4f" />

2. It will prompt you to create an Oracle account. Create one, and log in. If you receive a password validation error even though your passwords match, try creating the account in an Incognito/Private/InPrivate window.
    <img width="918" height="202" alt="image" src="https://github.com/user-attachments/assets/e3e17fb2-0307-4937-9ecf-0fb2053e5f1f" />

3. Download the executable (you can place the executable called `jdk-11.0.30_windows-x64_bin.exe` anywhere you want; I usually leave it in the default `Downloads` folder).

4. Run the executable that you just downloaded (by **double-clicking it**) and follow through the setup wizard  
    <img width="497" height="377" alt="image" src="https://github.com/user-attachments/assets/0f500e81-6cb8-4a4e-8080-a5b545494fc7" />

5. Install it in the default directory.

6. You should now have this. You can click close:  
    <img width="498" height="377" alt="image" src="https://github.com/user-attachments/assets/16af440d-e657-4f7a-9a6e-fef4cebd45ba" />

That's it!

## Installing Java on MacOS
1. If you have a Mac with **Apple Silicon**, choose the `Arm 64 DMG Installer`  
    <img width="2048" height="110" alt="image" src="https://github.com/user-attachments/assets/92f540a2-0612-4fc2-941e-7c974615b1e2" />

2. If you have a Mac with an **Intel chip**, choose `x64 DMG Installer`
    <img width="2048" height="110" alt="image" src="https://github.com/user-attachments/assets/114f32c4-c8b5-457f-b8dc-2230f275e941" />

3. It will prompt you to create an Oracle account. Create one and log in. If you receive a password validation error even though your passwords match, try creating the account in an Incognito/Private/InPrivate window.  
    <img width="918" height="202" alt="image" src="https://github.com/user-attachments/assets/548496ea-9027-44e5-aad0-844ec68b1b5f" />

4. Download the executable.

6. Open the `.pkg` installer and follow through the installation instructions  
    <img width="1228" height="878" alt="image" src="https://github.com/user-attachments/assets/7ef7d384-7dac-4bbc-a525-3a0d0f2cba18" />

7. Click "Continue" and you should see this:  
    <img width="1222" height="874" alt="image" src="https://github.com/user-attachments/assets/06fdbbd1-e74c-4b8e-a23c-c0fb63e92186" />

8. Provide your login credentials and click "Install". After installation, you should see the following:  
    <img width="1224" height="882" alt="image" src="https://github.com/user-attachments/assets/ed34c617-c121-48f9-a947-72b51ba8897d" />

9. Click "close" and you're done!

**Note:** It's perfectly fine to see version `11.0.xx` (where `xx` is higher than `18`) in the above screenshots.

# Verify Java Installation (in two steps!)
**ONE:** Open your terminal. 
- For MacOS, press Command + Spacebar, type "Terminal", and hit Enter.
- For Windows, press the Windows key, type "Terminal", and hit Enter.

**TWO:** Run the following command: `java -version`

You should now see the Java version you're using! (Below is an example of how this looks. I personally have Java 17)  
<img width="1338" height="733" alt="image" src="https://github.com/user-attachments/assets/34a3ef6c-767c-40a1-b2cf-0b4c82983b7b" />

### If you run into issues when running these commands after you've installed Java, you may either need to:
1. Restart your terminal and run the commands again  
2. Make changes to your system Path variable (though this is typically not necessary): [https://www.java.com/en/download/help/path.html](https://www.java.com/en/download/help/path.html)

### If you have multiple Java versions installed and want to use Java 11:
*If you are on Windows, ask on Piazza or come to office hours. We will
provide information on this if there's demand.*

If you are on a Mac, the following steps will show you how to set the default version of Java to your preferred version (Java 11 is used as an example below).

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
---
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
---
# Writing a small Java program  
You will create a new Java file named `Hello.java` in Visual Studio Code.

1. **Open up Visual Studio Code**  
    > a. If you are using a personal computer, you can open `Visual Studio Code` like you would with a normal application.  
    > b. Alternatively, if you are using the **terminal (command line),** you can type in `code` and it should open up Visual Studio Code as well (pretty neat, right?).

You should be prompted with a welcome page that looks similar to the one below:  
    <img width="1021" height="769" alt="image" src="https://github.com/user-attachments/assets/858ca7f0-6d42-449b-a29a-7ebc9f4b5772" />

2. Create your working folder!  
a. Create a dedicated folder for `CSE 11` and place it anywhere on your computer (e.g., in the Desktop).  
<img width="459" height="572" alt="image" src="https://github.com/user-attachments/assets/6705c4a0-04ad-4a6f-97d4-43d46d51c836" />
<br>
<br>

b. Then, inside the `CSE 11` folder, create a dedicated folder for your CSE 11 Programming Assignments (e.g., `CSE 11 PAs`) to stay organized.  
<img width="1428" height="419" alt="image" src="https://github.com/user-attachments/assets/fb9f11f5-a36c-44d9-b71f-28ea6b9518c3" />
<br>
<br>
c. Then, inside `CSE 11 PAs`, create one last folder (I promise!) for this small program to live on (e.g., `PA0`).  
   <img width="1428" height="548" alt="image" src="https://github.com/user-attachments/assets/bbeba60e-86be-4a7b-bc5c-4407ecbb46d3" />

5. Now, let's open our `PA0` folder inside VS Code so we can start programming!  
    Click on the Explorer tab and select "Open Folder" in VS Code.  
    <img width="444" height="423" alt="image" src="https://github.com/user-attachments/assets/34037ce7-7630-4440-a534-b8e39fc713fc" />

6. Then navigate to the location where you stored `PA0` (e.g., Desktop → CSE 11 → CSE 11 PAs → PA0), click on `PA0` and then `Select Folder`.
<img width="1416" height="1066" alt="image" src="https://github.com/user-attachments/assets/b06d696c-9b47-46f3-a3d3-a6c39c7a146c" />
<br>
<br>

7. You should see the VS Code explorer showing the `PA0` folder (currently empty).  
Click on the "New File" icon to create the file for this small program.
<img width="2880" height="1691" alt="image" src="https://github.com/user-attachments/assets/d45066e0-706b-4330-9707-6bec6b1e7b07" />
<br>
<br>

8. Name this file `Hello.java` and hit Enter. **Note that the file name starts with an Uppercase** (this is important).  
<img width="2748" height="1540" alt="image" src="https://github.com/user-attachments/assets/eb49becb-3bea-4a10-b60d-390108360ec9" />
<br>
<br>

9. Copy-paste the code below (this is called **boilerplate code**, it's code we use in all our programs to make them run!):
```java
public class Hello {
    public static void main(String[] args) {


        
    }
}
```

You should see this on your screen:  
<img width="2748" height="1608" alt="image" src="https://github.com/user-attachments/assets/8b3f5232-364b-43f8-97be-29d378283b69" />

10. Notice that a **white circle** is next to the file name tab. This means **your progress is not saved**. Hit `CTRL + S` on Windows or `CMD + S` on Mac to save your file (and the white circle should go away)
<img width="706" height="245" alt="image" src="https://github.com/user-attachments/assets/748e0e61-76cd-4abf-a9e3-c954a9e0e697" />

### Now we dive into the actual coding! Let's have this program print "Hello" first.
1. Copy-paste this line inside the main function:

```java
System.out.println("Hello");
```

You should have the following on your screen:  
<img width="1553" height="624" alt="image" src="https://github.com/user-attachments/assets/54913ffe-374f-45e0-9ed6-227981ee0e3f" />

2. Open the terminal by going to the `Terminal` menu in the top toolbar, then select `New Terminal`  
<img width="2864" height="1692" alt="image" src="https://github.com/user-attachments/assets/446d7748-2f29-433e-9bcb-44dafc45548b" />

This will open a terminal for your current folder (i.e., for `PA0`). You should see the following on your screen:  
<img width="2854" height="1633" alt="image" src="https://github.com/user-attachments/assets/a2a79d1d-3028-4c55-b48f-e2daa15ebab2" />

3. To run our program using the terminal, we need to do a **two step process**:
- Compile `Hello.java` by typing `javac Hello.java` in the terminal  
<img width="1266" height="327" alt="image" src="https://github.com/user-attachments/assets/5110664b-228b-476b-af8b-cc035e737953" />

 and hitting Enter. (This will create some new files with the `.class` extension, don't worry about them).
<br>

<img width="2750" height="1541" alt="image" src="https://github.com/user-attachments/assets/f50ee341-c743-49c2-9b4b-2d2c9e4e9b4a" />

- Execute `Hello.java` by typing `java Hello` in the terminal (after you compiled in the previous step)
<img width="1234" height="434" alt="image" src="https://github.com/user-attachments/assets/fa85dcb0-3f33-4010-9f81-437f28e03d57" />

 and hitting Enter.  
 <br>
 
 <img width="1278" height="623" alt="image" src="https://github.com/user-attachments/assets/fc4b3d83-456f-445d-aeff-30792672f19d" />

You should see "hello" now! (As shown above).

### Now let's use a single variable to have the program say "Hello World!"  
1. Copy-paste this line inside the main function AND before the print line:
```java
String x = "World!";
```
You should have the following now:  
<img width="2705" height="1582" alt="image" src="https://github.com/user-attachments/assets/53d45167-4bd1-4be6-be67-313d2a14650f" />

2. Then, modify the print line so it uses `x` to print "Hello World!" as follows:  
> Note that we added a space after "Hello" (i.e., "Hello "):
<img width="1201" height="677" alt="image" src="https://github.com/user-attachments/assets/a3a55072-73fe-481b-bd1e-c33a1aa1e320" />

3.  Run the program again using the terminal and our **two-step process** from above:
<img width="1233" height="591" alt="image" src="https://github.com/user-attachments/assets/a4c2de1e-9e62-4be4-b971-38c2e624e880" />

That's it! You have successfully used a String variable as input to output your message with the desired word "World!".
