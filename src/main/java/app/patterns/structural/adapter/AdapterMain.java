package app.patterns.structural.adapter;

 class AdapterMain {

  public static void main(String[] args) {
    Database database = new AdapterJavaAppToDatabase();

    database.insert();
    database.update();
    database.select();
    database.remove();
  }

}
