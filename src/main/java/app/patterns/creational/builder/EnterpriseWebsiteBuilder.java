package app.patterns.creational.builder;

class EnterpriseWebsiteBuilder extends WebsiteBuilder {

  @Override
  public void buildName() {
    website.setName("Enterprise web site");
  }

  @Override
  public void buildCms() {
    website.setCms(Cms.ALIFRESCO);
  }

  @Override
  public void buildPrice() {
    website.setPrice(10000);
  }
}
