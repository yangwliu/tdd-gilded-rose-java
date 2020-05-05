package cn.xpbootcamp.gilded_rose;

public class CommonProduct extends Product{

  private double speed;

  public CommonProduct(int sellIn, double quality, double speed) {
    super(sellIn, quality);
    this.speed = speed;
  }

  public double getSpeed() {
    return speed;
  }

  @Override
  public void update() {
    int sellIn = getSellIn() - 1;
    setSellIn(sellIn);
    double quality = getQuality();
    if (sellIn > 0) {
      quality = quality - speed;
    } else {
      quality = quality - 2 * speed;
    }
    setQuality(quality >= 0 ? quality : 0);
  }
}
