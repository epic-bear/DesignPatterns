package app.patterns.creational.factory;

class DeveloperFactory {

  Developer createDeveloper(String speciality) {
    return switch (speciality.toLowerCase()) {
      case "java" -> new JavaDeveloper();
      case "cpp" -> new CppDeveloper();
      default -> throw new RuntimeException("Enter Cpp or Java.");
    };
  }
}
