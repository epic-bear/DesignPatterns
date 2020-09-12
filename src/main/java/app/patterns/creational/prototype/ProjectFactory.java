package app.patterns.creational.prototype;

class ProjectFactory {

  Project project;

  public ProjectFactory(Project project) {
    this.project = project;
  }

  public Project cloneProject() {

    return (Project) project.copy();
  }
}
