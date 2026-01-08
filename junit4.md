# JUnit Setup (Terminal And VS Code)

Open the [JUnit Demo](https://github.com/CaoAssignments/junit-demo) and download the files into a folder (Code > Download Zip). You can name the folder whatever you like, but for the purpose of the guide, we will refer to it as `junit-demo`.

The JUnit tests are located in the `DemoArrayImplTester.java` file. You may notice that two of the tests are blank. They will pass because there is nothing in it, but as practice you should complete the TODO sections and implement the described tests.

## Terminal Setup (Good for any IDE)

1. Open the folder `junit-demo`

2. You will notice that there is a lib folder with jar files, those are important for using `JUnit`

3. Open a terminal window and navigate to the `junit-demo` folder.

4. Run these commands:

   - Mac/Unix Users:

     - Compile: `javac -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:. DemoArrayImplTester.java`
     - Execute: `java -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore DemoArrayImplTester`

   - Windows Users:

     - Compile: `javac -cp ".;lib\junit-4.12.jar;lib\hamcrest-core-1.3.jar" DemoArrayImplTester.java`
     - Execute: `java -cp ".;lib\junit-4.12.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DemoArrayImplTester`

   - Command explanation:
     - `javac`: compiles the folder
     - `-cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:.`: Specifies the JUnit4 dependencies (inside `lib`)
     - `DemoArrayImplTester.java`: the tester file we want to compile and run

The output should look something like this:

      JUnit version 4.12
      .....
      Time: 0.0004

      OK (4 tests)

## VS Code Setup (Through some Extensions)

1. Open the folder `junit-demo` in VSCode. Make sure that you are opening this folder in the editor! You may encounter issues if you open a parent folder.

2. Open the tester file `DemoArrayImplTester.java`.
   
   You might notice that there are some red errors:

   <img src="https://i.imgur.com/H07YX1d.png" width=300>

   Don't worry about these for now.

4. On the left side of VSCode, there are ICONS, please click on the icon that looks like a beaker.
   If there is no beaker, please go to "Manage" - "Extensions", and install "Extension Pack for Java". If you already have "Extension Pack for Java" installed, make sure all of the extensions are up-to-date.

   This beaker will show up if you have the tester file `DemoArrayImplTester.java` open.

   <img src="https://i.imgur.com/YUvR3Ri.png" height=400>

5. Please Enable Java Test and select **JUnit** (NOT JUnit Jupiter).

   <img src="https://i.imgur.com/pRW5Qfn.png" height=300>

   <img src="https://i.imgur.com/7Q4TFxv.png" height=150>

6. Then you will see the unit Tests if they pass or fail. All of them will pass, but this image below is an idea of what it could look like.

   <img src="https://i.imgur.com/TlqHEtF.png" height=150>

   To re-run the tests, press the `Run Tests` button (double right arrow) at the top of the `TESTING` tab.

## Common Problems and Solutions
Not all computers are the same. Below are some problems you might encounter and what you can do to try to fix them.
### Beaker is not showing up
This is the most common problem you might encounter. Try any or all of the following (listed in order of what to try first):
1. Ensure you ONLY have `junit-demo` opened in VS Code. If not, then go to `File` -> `Open Folder` and open `junit-demo` only.
2. Ensure VS Code is up to date. If it is, completely quit VS Code and re-open it. After you reopen it, you must wait up to 30 seconds. While you wait, make sure to open any Java file inside `junit-demo` to force VS Code to load the Java and JUnit extensions. The beaker should show.
3. If everything is up to date and you restarted VS Code, and you are only in `junit-demo` and the beaker still doesn't show, then ensure you have the right extensions installed (you'd be surprised how many people end up having two of the three extensions). Again, the extensions are "Extension Pack for Java", "Java", and "Test Runner for Java".
4. If none of the above worked. Uninstall ALL extensions (even those not related to Java) and re-install the ones we mentioned here only. There are extensions that conflict with the ones we need here, and that is something that prevents people from seeing the beaker.
5. If there are Java version conflicts (some people have more than 3 versions of Java), remove all other versions from your system and keep the one we need.
6. For the M4 Macs, the extensions mentioned in the guide work better with Java 25, so you just need to download Java 25 instead (VS Code will suggest you that option, accept it, and download it).

### Beaker shows up, but I don't see any tests in there (I don't see anything to run).
JUnit is properly installed, but your current VS Code window doesn't know where to find the `lib` folder.
To tell VS Code where your `lib` or `libs` folder is, just do `CTRL (Command) + SHIFT + P` and type `Java Configure Classpath`.  
<img width="1115" height="354" alt="image" src="https://github.com/user-attachments/assets/f20d75f9-b578-4e63-9fdf-6fd84f1c0ea9" />

Click Enter, and you will see a menu with several tabs. Select the `Libraries` tab.

<img width="1784" height="612" alt="image" src="https://github.com/user-attachments/assets/f066886a-824e-4d7b-8834-ee5b6b34ba3d" />  

If you don't see anything, click on the `+` button to add the **two files inside the `lib` folder**.
Then, don't forget to click on "APPLY SETTINGS".

That's it! Go back to the beaker, and you should be able to see your tests. **You might need to do this for every single PA.**


