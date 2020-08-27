package com.pokerHands;

public class PokerDuel {

    private static final String[] POKER_TYPE = {"high card",
            "pair", "two pair", "three of a kind", "straight",
            "flush", "full house", "four of a kind", "straight flush"};
    PokerType pokerType = new PokerType();
    PokerSort pokerSort = new PokerSort();

    public String getPokerDuelResult(String[] black_poker, String[] white_poker) {
        int blackPokerTypeSerial = pokerType.packPokerType(black_poker);
        int whitePokerTypeSerial = pokerType.packPokerType(white_poker);
        Integer[] blackPokerSort = pokerSort.sortPokerNumber(black_poker);
        Integer[] whitePokerSort = pokerSort.sortPokerNumber(white_poker);
        if (blackPokerTypeSerial > whitePokerTypeSerial) {
            return "Black wins. - with " + POKER_TYPE[blackPokerTypeSerial] +
                    ": " + pokerSort.sortPokerNumber(black_poker)[0];
        }
        if (blackPokerTypeSerial < whitePokerTypeSerial) {
            return "White wins. - with " + POKER_TYPE[whitePokerTypeSerial] +
                    ": " + pokerSort.sortPokerNumber(white_poker)[0];
        }
        for (int i = 0; i < blackPokerSort.length && blackPokerSort[i] != null; i++) {
            if (blackPokerSort[i] > whitePokerSort[i]) {
                return "Black wins. - with " + POKER_TYPE[blackPokerTypeSerial] +
                        ": " + pokerSort.sortPokerNumber(black_poker)[i];
            }
            if (blackPokerSort[i] < whitePokerSort[i]) {
                return "White wins. - with " + POKER_TYPE[whitePokerTypeSerial] +
                        ": " + pokerSort.sortPokerNumber(white_poker)[i];
            }
        }
        return "Tie.";
    }
}
