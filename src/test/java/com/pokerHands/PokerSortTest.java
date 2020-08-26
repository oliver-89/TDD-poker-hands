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

    @Test
    void should_return_36_when_sort_poker_number_given_3D_3H_6S_3C_6D() {
        //given
        String[] poker = {"3D", "3H", "3C", "6S", "6D"};

        //when
        Integer[] result = pokerSort.sortPokerNumber(poker);

        //then
        assertEquals(3,result[0]);
        assertEquals(6,result[1]);
    }

    @Test
    void should_return_K7653_when_sort_poker_number_given_3D_KD_5D_6D_7D() {
        //given
        String[] poker = {"3D", "KD", "5D", "6D", "7D"};

        //when
        Integer[] result = pokerSort.sortPokerNumber(poker);

        //then
        assertEquals(13,result[0]);
        assertEquals(7,result[1]);
        assertEquals(6,result[2]);
        assertEquals(5,result[3]);
        assertEquals(3,result[4]);
    }

    @Test
    void should_return_76543_when_sort_poker_number_given_3D_4S_5D_6D_7D() {
        //given
        String[] poker = {"3D", "4S", "5D", "6D", "7D"};

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
    void should_return_365_when_sort_poker_number_given_3D_3H_5S_3C_6D() {
        //given
        String[] poker = {"3D", "3H", "3C", "5S", "6D"};

        //when
        Integer[] result = pokerSort.sortPokerNumber(poker);

        //then
        assertEquals(3,result[0]);
        assertEquals(6,result[1]);
        assertEquals(5,result[2]);
    }

    @Test
    void should_return_635_when_sort_poker_number_given_3D_3H_6S_5C_6D() {
        //given
        String[] poker = {"3D", "3H", "5C", "6S", "6D"};

        //when
        Integer[] result = pokerSort.sortPokerNumber(poker);

        //then
        assertEquals(6,result[0]);
        assertEquals(3,result[1]);
        assertEquals(5,result[2]);
    }

    @Test
    void should_return_6543_when_sort_poker_number_given_3D_4H_6S_5C_6D() {
        //given
        String[] poker = {"3D", "4H", "5C", "5S", "6D"};

        //when
        Integer[] result = pokerSort.sortPokerNumber(poker);

        //then
        assertEquals(5,result[0]);
        assertEquals(6,result[1]);
        assertEquals(4,result[2]);
        assertEquals(3,result[3]);
    }
}
