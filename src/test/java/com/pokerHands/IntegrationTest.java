package com.pokerHands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {

    PokerDuel pokerDuel = new PokerDuel();

    @Test
    void should_return_white_wins_when_get_poker_duel_result_given_2H_3D_5S_9C_KD_2C_3H_4S_8C_AH() {
        //given
        String[] black_poker = {"2H", "3D", "5S", "9C", "KD"};
        String[] white_poker = {"2C", "3H", "4S", "8C", "AH"};

        //when
        String result = pokerDuel.getPokerDuelResult(black_poker, white_poker);

        //then
        assertEquals("White wins. - with high card: 14", result);
    }
}
