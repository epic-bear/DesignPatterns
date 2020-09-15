package app.patterns.behavioral.visitor;

public class VisitorMain {

  public static void main(String[] args) {
    Project project = new Project();

    Developer junior = new JuniorDeveloper();
    Developer senior = new SeniorDeveloper();

    project.beWritten(junior);
    System.out.println("\n===========\n");
    project.beWritten(senior);
  }
}
