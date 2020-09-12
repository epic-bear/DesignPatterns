package app.patterns.creational.singleton;

class ProgramRunner {

  public static void main(String[] args) throws InterruptedException {
    ProgramLogger.getProgramLogger().addLogInfo("First log...");
    Thread.sleep(5000);
    ProgramLogger.getProgramLogger().addLogInfo("Second log...");
    Thread.sleep(5000);
    ProgramLogger.getProgramLogger().addLogInfo("Third log...");

    ProgramLogger.getProgramLogger().showLogFile();
  }
}
