# Learn_Java Example

This project illustrates some basic Java concepts, including:
- Language
- main()
- class
- visibility modifiers
- inheritance
- methods
- control flow
- looping
- logging

## Language
Java program code is under src/main/java.

Support (non-Java) files, like configuration files, icons, and so forth, go in src/main/resources.

Java unit test code, mini-programs that verify classes in the "real" 
program behave correctly, reside in src/test/java.

Java files are organized into folders, called packages.  Packages use a "." as a separator.  The
package frc.robot in the program code means the folder src/main/java/frc/robot.

## Building
Clone the GitHub repo and use VS Code's File->Open Folder to open the Learn_Java project folder.

VS Code should execute a build upon opening.  You will need an Internet connection to download supporting
libraries (.jar files).  This will happen automatically on the first build.  Subsequent builds can be
done offline.

After modifying files, build the code and run the unit tests with Ctrl-Shift-P WPILib: Build robot code.

## Interesting classes
In src/main/java/frc/robot/shapes is an interface, Shape.java.  This defines 2 methods any class 
that is a Shape must implement.  Note that the interface does not say what those methods should do,
only that they must be present.  Circle.java, Rectangle.java, and Square.java all implement Shape.  
Rectangle and Square also illustrate "inheritance".  This is a good place to begin.

The src/test/java/frc/robot/shapes folder contains JUnit automated unit tests of the Shape implementations.
As Programmers, we must assume programs are broken until we prove they are not.  Unit tests, sort of
like supports for 3D-printed parts, verify that methods on classes produce the output they are supposed
to.  They run on every Build providing rapid warning if a change has a bug.

The TestCircle, and TestRectangle unit tests should be understood before TestShapes.

TestShapes.java shows how to use logging.