package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasTest {

  @Test
  void should_quality_not_change_when_update() {
    Sulfuras sulfuras = new Sulfuras(40);
    sulfuras.update();;
    assertEquals(40, sulfuras.getQuality());
  }

}