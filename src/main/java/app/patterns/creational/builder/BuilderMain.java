package app.patterns.creational.builder;

 class BuilderMain {

  public static void main(String[] args) {
    Director director = new Director(new EnterpriseWebsiteBuilder());

    Website website = director.buildWebsite();

    System.out.println(website);
  }

}
