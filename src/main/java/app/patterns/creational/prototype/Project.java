package app.patterns.creational.prototype;

class Project implements Copyable {

  private int id;
  private String projectName;
  private String sourceCode;

  public Project(int id, String projectName, String sourceCode) {
    this.id = id;
    this.projectName = projectName;
    this.sourceCode = sourceCode;
  }

  @Override
  public Object copy() {

    return new Project(id, projectName, sourceCode);
  }

  @Override
  public String toString() {
    return "Project{" +
        "id=" + id +
        ", projectName='" + projectName + '\'' +
        ", sourceCode='" + sourceCode + '\'' +
        '}';
  }
}
