package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.exception.IllegalQualityException;

public class Product {

  private int sellIn;
  private double quality;

  public Product(int sellIn, double quality) {
    if (quality > 50 || quality < 0) {
      throw new IllegalQualityException("Quality should not more than 50!");
    }
    this.sellIn = sellIn;
    this.quality = quality;
  }

  public void update() {

  };

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
