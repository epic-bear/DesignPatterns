package app.patterns.creational.prototype;

class PrototypeMain {

  public static void main(String[] args) {
    Project project = new Project(1, "Project", "Source code");

    System.out.println(project.toString());

    ProjectFactory projectFactory = new ProjectFactory(project);

    Project clone = projectFactory.cloneProject();

    System.out.println(clone);
  }
}
