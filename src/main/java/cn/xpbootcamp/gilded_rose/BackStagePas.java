package cn.xpbootcamp.gilded_rose;

public class BackStagePas extends Product {

  public BackStagePas(int sellIn, double quality) {
    super(sellIn, quality);
  }

  @Override
  public void update() {
    int sellIn = getSellIn();
    setSellIn(sellIn - 1);
  }
}
