package app.patterns.creational.builder;

class Director {

  private WebsiteBuilder builder;

  public Director(WebsiteBuilder builder) {
    this.builder = builder;
  }

  Website buildWebsite() {
    builder.createWebsite();
    builder.buildName();
    builder.buildCms();
    builder.buildPrice();

    return builder.getWebsite();

  }
}
