package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonProductTest {

  @Test
  void should_quality_lose_one_time_when_sellIn_not_below_zero() {
    CommonProduct commonProduct = new CommonProduct(5, 30, 5);
    commonProduct.update();
    assertEquals(commonProduct.getSpeed(), 30 - commonProduct.getQuality());
  }

  @Test
  void should_quality_equals_zero_when_update_given_quality_is_not_greeter_than_lose_and_sellIn_is_more_than_zero() {
    CommonProduct commonProduct = new CommonProduct(5, 4, 5);
    commonProduct.update();
    assertEquals(0, commonProduct.getQuality());
  }

}