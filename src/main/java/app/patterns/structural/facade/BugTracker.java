package app.patterns.structural.facade;

public class BugTracker {

  private boolean activeSprint;

  public boolean isActiveSprint() {
    return activeSprint;
  }

  public void startSprint() {
    System.out.println("Sprint in active.");
    activeSprint = true;
  }

  public void finishSprint() {
    System.out.println("Sprint is not active.");
    activeSprint = false;
  }
}
