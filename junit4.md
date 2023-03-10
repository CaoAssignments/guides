# JUnit Setup

Open the [JUnit Demo](https://github.com/Darleenie/junitDemo) and download the files into a folder named `junitDemo`.
The test will pass because there is nothing in it. You should complete the TODO sections.

## General IDE (Terminal)

1. Open the folder `junitDemo`

2. You will notice that there is a lib folder with jar files, those are important for `JUnit`

3. Under the `junitDemo` folder, run these commands:

   - Mac Users: 
      - Compile: `javac -cp libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar:. DemoArrayImplTester.java`
      - Execute: `java -cp libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore DemoArrayImplTester`

   - Windows Users:
      - Compile: `javac -cp ".;libs\junit-4.12.jar;libs\hamcrest-core-1.3.jar" DemoArrayImplTester.java`
      - Execute: `java -cp ".;libs\junit-4.12.jar;libs\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DemoArrayImplTester`

   - Command explanation: 
      - `javac`: compiles the folder
      - `libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar:.` JUnit4 dependencies
      - `DemoArrayImplTester.java:` the tester file we want to compile and run

## VSCode Extension

1. Open the folder `junitDemo` in VSCode. You might notice that there are some red errors.

   <img src="https://i.imgur.com/H07YX1d.png" width=300>
   
2. Open the tester file `DemoArrayImplTester.java`.

2. On the left side of VSCode, there are ICONS, please click on the icon that looks like a beaker. 
   If there is no beaker, please go to "Manage" - "Extensions", and install "Extension Pack for Java".
   This beaker will show up if you have the tester file `DemoArrayImplTester.java` open.
   
   <img src="https://i.imgur.com/PZiXvL9.png" height=400>

3. Please Enable Java Test and select **JUnit** (NOT JUnit Jupiter).

   <img src="https://i.imgur.com/pRW5Qfn.png" height=300>
   
   <img src="https://i.imgur.com/Tj6VSXW.png" height=150>
 
4. Then you will see the unit Tests if they pass or fail. All of them will pass but this image below is an idea of what should look like.

   <img src="https://i.imgur.com/Lo3vMvm.png" height=150>



