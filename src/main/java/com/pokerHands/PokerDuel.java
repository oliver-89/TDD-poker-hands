package com.pokerHands;

public class PokerDuel {

    PokerType pokerType = new PokerType();
    PokerSort pokerSort = new PokerSort();
    private static final String[] POKER_TYPE = {"high card",
            "pair", "two pair", "three of a kind", "straight",
            "flush", "full house", "four of a kind", "straight flush"};

    public String getPokerDuelResult(String[] black_poker, String[] white_poker) {
        int blackPokerTypeSerial = pokerType.packPokerType(black_poker);
        int whitePokerTypeSerial = pokerType.packPokerType(white_poker);
        if (blackPokerTypeSerial > whitePokerTypeSerial) {
            return "Black wins. - with " + POKER_TYPE[blackPokerTypeSerial] +
                    ": " + pokerSort.sortPokerNumber(black_poker)[0];
        }
        if (blackPokerTypeSerial < whitePokerTypeSerial) {
            return "White wins. - with " + POKER_TYPE[whitePokerTypeSerial] +
                    ": " + pokerSort.sortPokerNumber(white_poker)[0];
        }
        return "Tie.";
    }
}
