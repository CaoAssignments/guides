# `checkstyle` for Style Guide
`checkstyle` is a tool to automatically check style issues in your code. Here we provide some `checkstyle` rules in [checkstyle.xml](checkstyle.xml) to help you check for any style issues in your code. 

> **Warning**
> 
> `checkstyle` does not check for all items in our style guide. Passing all our checkstyle rules does not guarantee that you'll get full points on style (but you'll get most of them). Please do follow our style guide and manually check for each item before submission. Here's a non-exhaustive list that `checkstyle` can't check.
> 
> 1. File headers
> 2. Variable names
> 3. Magic numbers for string and char literals
> 4. Short methods

## Running `checkstyle` in Terminal
1. Download Checkstyle 10.7.0 (`checkstyle-10.7.0-all.jar`) from [Github](https://github.com/checkstyle/checkstyle/releases/tag/checkstyle-10.7.0).
2. Download [`checkstyle.xml`](https://github.com/CaoAssignments/style-guide/raw/main/checkstyle.xml) from this repo.
3. Copy both files to the folder where you store your code. 
![img_1.png](img/terminal-step3.png)
4. In the terminal, run `java -jar checkstyle-10.7.0-all.jar -c checkstyle.xml [your java file]`, for example, `java -jar checkstyle-10.7.0-all.jar -c checkstyle.xml MyLinkedList.java`. You'll see a list of errors that indicate style issues in your code. 

    ![img_3.png](img/terminal-step4.png)
