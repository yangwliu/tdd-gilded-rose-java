package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.exception.IllegalQualityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductTest {

  @Test
  void should_throw_exception_when_constructor_an_product_given_quality_more_than_fifty() {
    assertThrows(IllegalQualityException.class, () ->new Product(10, 60));

  }

}