package app.patterns.structural.proxy;

public class ProjectRunner {

  public static void main(String[] args) {
    Project project = new ProxyProject("https://github.com/app/main/java/project");

    project.run();
  }
}
