package com.pokerHands;

import java.util.Arrays;

public class PokerFormat {
    public static Integer[] formatPokerNumber(String[] poker) {
        Character[] pokersNumber = Arrays.stream(poker).map(s -> s.charAt(0)).toArray(Character[]::new);
        return Arrays.stream(pokersNumber).map(pokerNumber -> {
            if (pokerNumber == 'A') {
                return 14;
            }
            if (pokerNumber == 'T') {
                return 10;
            }
            if (pokerNumber == 'J') {
                return 11;
            }
            if (pokerNumber == 'Q') {
                return 12;
            }
            if (pokerNumber == 'K') {
                return 13;
            }
            return Integer.parseInt(String.valueOf(pokerNumber));
        }).toArray(Integer[]::new);
    }

    public static Character[] formatPokerSuit(String[] poker) {
        return Arrays.stream(poker).map(s -> s.charAt(1)).toArray(Character[]::new);
    }

    public static Integer[] calcPokerNumber(Integer[] pokersNumber){
        Integer[] poker = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (Integer integer : pokersNumber) {
            poker[integer - 2]++;
        }
        return poker;
    }
}
