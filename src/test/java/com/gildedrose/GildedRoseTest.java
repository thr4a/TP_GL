package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.name, is("foo"));
  }

  @Test
  @DisplayName("Test that updateQuality part 1 works")
  void testUpdateA() {
    Item one = new Item("zoo", 4, 9);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(8));
  }

  @Test
  @DisplayName("Test that updateQuality part 2 works")
  void testUpdateB() {
    Item one = new Item("zoo", 4, 0);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(0));
  }

  @Test
  @DisplayName("Test that updateQuality part 3 works")
  void testUpdateC() {
    Item one = new Item("Sulfuras, Hand of Ragnaros", 4, 9);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(9));
  }

  @Test
  @DisplayName("Test that updateQuality part 4 works")
  void testUpdateD() {
    Item one = new Item("Aged Brie", 4, 9);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(10));
  }

  @Test
  @DisplayName("Test that updateQuality part 5 works")
  void testUpdateE() {
    Item one = new Item("Backstage passes to a TAFKAL80ETC concert", 7, 9);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(11));
  }

  @Test
  @DisplayName("Test that updateQuality part 6 works")
  void testUpdateF() {
    Item one = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 9);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(12));
  }

  @Test
  @DisplayName("Test that updateQuality part 7 works")
  void testUpdateG() {
    Item one = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 9);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(10));
  }

  @Test
  @DisplayName("Test that updateQuality part 8 works")
  void testUpdateH() {
    Item one = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(50));
  }

  @Test
  @DisplayName("Test that updateQuality part 9 works")
  void testUpdateI() {
    Item one = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(50));
  }

  @Test
  @DisplayName("Test that updateQuality part 10 works")
  void testUpdateJ() {
    Item one = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(50));
  }

  @Test
  @DisplayName("Test that updateQuality part 11 works")
  void testUpdateK() {
    Item one = new Item("zoo", -1, 5);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(3));
  }

  @Test
  @DisplayName("Test that updateQuality part 12 works")
  void testUpdateL() {
    Item one = new Item("Sulfuras, Hand of Ragnaros", -1, 5);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(5));
  }

  @Test
  @DisplayName("Test that updateQuality part 13 works")
  void testUpdateM() {
    Item one = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 5);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(0));
  }

  @Test
  @DisplayName("Test that updateQuality part 14 works")
  void testUpdateN() {
    Item one = new Item("Aged Brie", -1, 5);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(7));
  }

  @Test
  @DisplayName("Test that updateQuality part 15 works")
  void testUpdateO() {
    Item one = new Item("Aged Brie", -1, 50);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(50));
  }

  @Test
  @DisplayName("Test that updateQuality case Conjured works")
  void testUpdateConjured() {
    Item one = new Item("Conjured", 4, 50);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(48));
  }

  @Test
  @DisplayName("Test that updateQuality case Conjured works")
  void testUpdateConjured1() {
    Item one = new Item("Conjured", -1, 50);
    GildedRose app = new GildedRose(new Item[] {one});
    app.updateQuality();
    assertThat(one.quality, is(46));
  }

  @Test
  @DisplayName("Test that toString works")
  void testToString() {
    Item one = new Item("Aged Brie", -1, 50);
    assertThat(one.toString(), is("Aged Brie, -1, 50"));
  }
}
