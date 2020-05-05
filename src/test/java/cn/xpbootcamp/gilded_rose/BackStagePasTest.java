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
}