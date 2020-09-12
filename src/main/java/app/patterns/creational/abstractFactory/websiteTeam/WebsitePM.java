package app.patterns.creational.abstractFactory.websiteTeam;

import app.patterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {

  @Override
  public void manageCode() {
    System.out.println("WebsitePM manages website project...");
  }
}
