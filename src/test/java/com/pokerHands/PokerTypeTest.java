package com.pokerHands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PokerTypeTest {

  PokerType pokerType = new PokerType();

  @Test
  void should_return_pair_when_verify_poker_type_given_KD_KS_2H_5D_9C() {
    //given
    String[] poker = {"KD", "KS", "2H", "5D", "9C"};

    //when
    int result = pokerType.packPokerType(poker);

    //then
    assertEquals(1,result);
  }

  @Test
  void should_return_two_pairs_when_verify_poker_type_given_KD_KS_2H_2D_9C() {
    //given
    String[] poker = {"KD", "KS", "2H", "2D", "9C"};

    //when
    int result = pokerType.packPokerType(poker);

    //then
    assertEquals(2,result);
  }

  @Test
  void should_return_three_of_a_kind_when_verify_poker_type_given_KD_KS_KH_2D_9C() {
    //given
    String[] poker = {"KD", "KS", "KH", "2D", "9C"};

    //when
    int result = pokerType.packPokerType(poker);

    //then
    assertEquals(3,result);
  }

  @Test
  void should_return_four_of_a_kind_when_verify_poker_type_given_KD_KS_KH_2D_KC() {
    //given
    String[] poker = {"KD", "KS", "KH", "2D", "KC"};

    //when
    int result = pokerType.packPokerType(poker);

    //then
    assertEquals(7,result);
  }

  @Test
  void should_return_full_house_when_verify_poker_type_given_3D_3S_3H_6D_6C() {
    //given
    String[] poker = {"3D", "3S", "3H", "6D", "6C"};

    //when
    int result = pokerType.packPokerType(poker);

    //then
    assertEquals(6,result);
  }
}
