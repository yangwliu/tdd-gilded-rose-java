package cn.xpbootcamp.gilded_rose;

public class BackStagePas extends Product {

  public BackStagePas(int sellIn, double quality) {
    super(sellIn, quality);
  }

  @Override
  public void update() {
    int sellIn = getSellIn();
    setSellIn(sellIn - 1);
    double quality = getQuality();
    if (sellIn > 5 & sellIn <= 10) {
      quality += 2;
    }
    if (sellIn <= 5 & sellIn > 0) {
      quality += 3;
    }
    if (sellIn == 0) {
      quality = 0;
    }
    setQuality(quality <= 50 ? quality : 50);
  }
}
