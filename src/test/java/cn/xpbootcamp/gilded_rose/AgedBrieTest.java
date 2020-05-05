package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {

  @Test
  void should_quality_get_bigger_when_update_given_sellIn_is_get_smaller() {
    AgedBrie agedBrie = new AgedBrie(5, 30, 5);
    agedBrie.update();
    assertEquals(35, agedBrie.getQuality());
  }

}