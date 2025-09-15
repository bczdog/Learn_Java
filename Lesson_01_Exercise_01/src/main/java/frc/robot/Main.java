// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private static Logger LOG = LoggerFactory.getLogger(Main.class);
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   * 
   * Learn_Java: for a Java program to be executed, it _must_ have a class
   * with a public static void main(String[] arguments) method.  For WPILib
   * robot programs, the class is usally also named "Main", and that is 
   * helpful.  Java does not care though.  You can run this class from 
   * the command line by typing:
   *   java frc.robot.Main
   * and the robot will start. If you wish to rename the class, or use
   * a package other than frc.robot, you will need to update build.gradle
   * (look for ROBOT_MAIN_CLASS).   
   */
  public static void main(String... args) {
    // RobotBase.startRobot(Robot::new); -- commenting as we don't actually want to start a Robot program

    // for is one of the most common loops.  Within the (),
    // it defines a variable (int i, initially set to 0); 
    // a condition to test that will terminate the loop when false (i < 10);
    // a statement to run that usually modifies the variable (i++)
    for (int i = 0; i < 10; i++) {
      writeMessages();
    }

    // To use a while loop, the variable that will terminate the loop must be defined
    // outside the loop.
    int count = 0; 
    while (count < 100) {
      // if () statements allow you choose what code to run based upon a boolean expression
      // the mod operator, %, is handy as it allows you to look at the remainder of integer division
      // In this example, we only call writeMessages() when count / 10 has remainder 0, so, 0, 10, 20, etc.
      if (count % 10 == 0) {
        writeMessages();
      } else {
        // we could use else if () {, if we needed to test another condition besides providing a default
        // note that else is optional with if().
        LOG.trace("main(): while count: {}", count);
      }
      // it is important that the variable being tested in the while() expression will trigger a false
      // to terminate the loop.  Otherwise the code goes runaway.
      count ++;
    }
    // do-while is less common but guarantees the loop will always execute once as the condition for
    // termination is evaluated at the end of the loop.
    do {
      writeMessages();
      count = count / 10;
      LOG.trace("main(): do-while count: {}", count);
    } while (count > 0);
  }

  /**
   * This is method to write a bunch of Hello Worlds to the console.  By playing with the 
   * src/main/resources/logback.xml, you can control how much of the messages display - important
   * when you have lots of loops or one loop that may spit a message every 20ms (50 / second).
   */
  private static void writeMessages() {
    System.out.println("Hello World!");
    System.err.println("Hello World!!");
    LOG.error("writeMessages(): Hello World error");
    LOG.warn("writeMessages(): Hello World warning");
    LOG.info("writeMessages(): Hello World info");
    LOG.debug("writeMessages(): Hello World debug");
    LOG.trace("writeMessages(): Hello World trace");
  }
}
