package app.patterns.creational.singleton;

import java.util.Date;

class ProgramLogger {

  private static ProgramLogger programLogger = new ProgramLogger();
  private static String logFile = "This is log file. \n\n";

  private ProgramLogger() {
  }

  public static ProgramLogger getProgramLogger() {

    return programLogger;
  }

  public void addLogInfo(String logInfo) {
    logFile += new Date().toString() + "\n";
    logFile += logInfo + "\n\n";
  }

  public void showLogFile() {
    System.out.println(logFile);
  }
}
