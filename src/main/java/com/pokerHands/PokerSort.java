package com.pokerHands;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokerSort {

    public Integer[] sortPokerNumber(String[] poker) {
        Integer[] pokerNumber = PokerFormat.formatPokerNumber(poker);
        List<Integer> calcPokerNumber = Arrays.asList(PokerFormat.calcPokerNumber(pokerNumber));
        List<Integer> sortResult = new ArrayList<>();
        if (!hasSamePokerNumber(poker)) {
            Arrays.sort(pokerNumber, Collections.reverseOrder());
            return pokerNumber;
        }
        if (hasSamePokerNumber(poker)) {
            if (calcPokerNumber.contains(4)) {
                sortResult.add(calcPokerNumber.indexOf(4) + 2);
            }
            if (calcPokerNumber.contains(3)) {
                sortResult.add(calcPokerNumber.indexOf(3) + 2);
            }
            if (calcPokerNumber.contains(2)) {
                sortResult.add(calcPokerNumber.lastIndexOf(2) + 2);
            }
            if (calcPokerNumber.contains(1)) {
                sortResult.add(calcPokerNumber.indexOf(1) + 2);
            }
        }
        return sortResult.toArray(new Integer[5]);
    }

    private Boolean hasSamePokerNumber(String[] poker) {
        PokerType pokerType = new PokerType();
        return pokerType.packPokerType(poker) != 8 &&
                pokerType.packPokerType(poker) != 5 &&
                pokerType.packPokerType(poker) != 4;
    }
}
