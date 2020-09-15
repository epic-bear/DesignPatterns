package app.patterns.behavioral.memento;

public class MementoMain {

  public static void main(String[] args) throws InterruptedException {
    Project project = new Project();
    GithubRepo githubRepo = new GithubRepo();

    project.setVersionAndUpdate("1.0");
    System.out.println(project);
    githubRepo.setSave(project.save());
    Thread.sleep(5000);
    project.setVersionAndUpdate("1.1");
    System.out.println(project);
    project.load(githubRepo.getSave());
    System.out.println(project);
  }
}
