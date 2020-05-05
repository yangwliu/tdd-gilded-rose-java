package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackStagePasTest {

  @Test
  void should_quality_not_change_when_update_given_sellIn_is_bigger_than_ten() {
    BackStagePas backStagePas = new BackStagePas(11, 30);
    backStagePas.update();
    assertEquals(30, backStagePas.getQuality());
  }

  @Test
  void should_quality_plus_2_when_update_given_sellIn_is_no_more_than_ten_and_more_than_five() {
    BackStagePas backStagePas = new BackStagePas(9, 30);
    backStagePas.update();
    assertEquals(32, backStagePas.getQuality());
  }

  @Test
  void should_quality_plus_3_when_update_given_sellIn_is_no_more_than_five_and_more_than_zero() {
    BackStagePas backStagePas = new BackStagePas(5, 30);
    backStagePas.update();
    assertEquals(33, backStagePas.getQuality());
  }

  @Test
  void should_quality_equals_0_when_update_given_sellIn_is_not_bigger_than_zero() {
    BackStagePas backStagePas = new BackStagePas(0, 30);
    backStagePas.update();
    assertEquals(0, backStagePas.getQuality());
  }

  @Test
  void should_quality_upper_to_fifty_when_update_given_updated_quality_more_than_fifty() {
    BackStagePas backStagePas = new BackStagePas(4, 48);
    backStagePas.update();
    assertEquals(50, backStagePas.getQuality());
  }
}