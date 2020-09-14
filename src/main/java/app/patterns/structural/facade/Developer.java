package app.patterns.structural.facade;

public class Developer {

  public void doJobBeforeDeadline(BugTracker bugTracker) {
    if (bugTracker.isActiveSprint()) {
      System.out.println("Developer is solver problems...");
    } else {
      System.out.println("Developer is reading Habrahabr...");
    }
  }
}
