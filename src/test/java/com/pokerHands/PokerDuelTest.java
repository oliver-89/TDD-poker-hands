package com.pokerHands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerDuelTest {

    PokerDuel pokerDuel = new PokerDuel();

    @Test
    void should_return_black_wins_when_get_poker_duel_result_given_3D_4D_5D_6D_7D_3D_3H_3S_3C_6D() {
        //given
        String[] black_poker = {"3D", "4D", "5D", "6D", "7D"};
        String[] white_poker = {"3D", "3H", "3C", "3S", "6D"};

        //when
        String result = pokerDuel.getPokerDuelResult(black_poker, white_poker);

        //then
        assertEquals("Black wins. - with straight flush: 7", result);
    }

    @Test
    void should_return_white_wins_when_get_poker_duel_result_given_3D_4D_5D_6D_7D_3D_3H_3S_3C_6D() {
        //given
        String[] black_poker = {"3D", "3H", "3C", "3S", "6D"};
        String[] white_poker = {"3D", "4D", "5D", "6D", "7D"};

        //when
        String result = pokerDuel.getPokerDuelResult(black_poker, white_poker);

        //then
        assertEquals("White wins. - with straight flush: 7", result);
    }

    @Test
    void should_return_White_wins_when_get_poker_duel_result_given_3D_4S_5D_6D_7D_4S_5H_6S_7C_8C() {
        //given
        String[] black_poker = {"3D", "4S", "5D", "6D", "7D"};
        String[] white_poker = {"4S", "5H", "6S", "7C", "8C"};

        //when
        String result = pokerDuel.getPokerDuelResult(black_poker, white_poker);

        //then
        assertEquals("White wins. - with straight: 8", result);
    }
}
