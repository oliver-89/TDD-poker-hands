package com.pokerHands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerSortTest {

    PokerSort pokerSort = new PokerSort();

    @Test
    void should_return_76543_when_sort_poker_number_given_3D_4D_5D_6D_7D() {
        //given
        String[] poker = {"3D", "4D", "5D", "6D", "7D"};

        //when
        Integer[] result = pokerSort.sortPokerNumber(poker);

        //then
        assertEquals(7,result[0]);
        assertEquals(6,result[1]);
        assertEquals(5,result[2]);
        assertEquals(4,result[3]);
        assertEquals(3,result[4]);
    }

    @Test
    void should_return_36_when_sort_poker_number_given_3D_3H_3S_3C_6D() {
        //given
        String[] poker = {"3D", "3H", "3C", "3S", "6D"};

        //when
        Integer[] result = pokerSort.sortPokerNumber(poker);

        //then
        assertEquals(3,result[0]);
        assertEquals(6,result[1]);
    }
}
