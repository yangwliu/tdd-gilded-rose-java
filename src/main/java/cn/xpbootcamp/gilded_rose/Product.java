package cn.xpbootcamp.gilded_rose;

public abstract class Product {

  private int sellIn;
  private double quality;

  Product(int sellIn, double quality) {
    this.sellIn = sellIn;
    this.quality = quality;
  }

  abstract void update();

  public int getSellIn() {
    return sellIn;
  }

  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  public double getQuality() {
    return quality;
  }

  public void setQuality(double quality) {
    this.quality = quality;
  }
}
