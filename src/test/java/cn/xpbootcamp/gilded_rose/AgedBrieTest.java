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

  @Test
  void should_quality_should_equals_fifty_when_update_given_sellIn_is_get_smaller_and_quality_will_more_than_fifty() {
    AgedBrie agedBrie = new AgedBrie(5, 49, 5);
    agedBrie.update();
    assertEquals(50, agedBrie.getQuality());
  }

}