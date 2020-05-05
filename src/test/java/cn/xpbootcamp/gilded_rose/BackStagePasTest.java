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
}