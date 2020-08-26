package com.pokerHands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PokerTypeTest {

  PokerType pokerType = new PokerType();

  @Test
  void should_return_pair_and_K_when_verify_poker_type_given_KD_KS_2H_5D_9C() {
    //given
    String[] poker = {"KD", "KS", "2H", "5D", "9C"};

    //when
    String[] result = pokerType.verifyPokerType(poker);

    //then
    assertEquals("pair",result[0]);
    assertEquals("K",result[1]);
  }

  @Test
  void should_return_two_pairs_and_K_when_verify_poker_type_given_KD_KS_2H_2D_9C() {
    //given
    String[] poker = {"KD", "KS", "2H", "2D", "9C"};

    //when
    String[] result = pokerType.verifyPokerType(poker);

    //then
    assertEquals("two pairs",result[0]);
    assertEquals("K",result[1]);
  }

  @Test
  void should_return_three_of_a_kind_and_K_when_verify_poker_type_given_KD_KS_KH_2D_9C() {
    //given
    String[] poker = {"KD", "KS", "KH", "2D", "9C"};

    //when
    String[] result = pokerType.verifyPokerType(poker);

    //then
    assertEquals("three of a kind",result[0]);
    assertEquals("K",result[1]);
  }


}
