package com.pokerHands;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class PokerSort {

    public Integer[] sortPokerNumber(String[] poker) {
        Integer[] pokerNumber = PokerFormat.formatPokerNumber(poker);
        Arrays.sort(pokerNumber, Collections.reverseOrder());
        return pokerNumber;
    }
}
