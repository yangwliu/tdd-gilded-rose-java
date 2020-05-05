package cn.xpbootcamp.gilded_rose;

public class AgedBrie extends Product {

  private double speed;

  public AgedBrie(int sellIn, double quality, double speed) {
    super(sellIn, quality);
    this.speed = speed;
  }

  @Override
  public void update() {
    int sellIn = getSellIn();
    setSellIn(sellIn - 1);
    double quality = getQuality() + speed;
    setQuality(quality <= 50 ? quality : 50);
  }
}
