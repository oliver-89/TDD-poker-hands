package com.pokerHands;

import java.util.Arrays;
import java.util.Collections;

public class PokerType {

  public int packPokerType(String[] poker) {
    Integer[] pokersNumber = PokerFormat.formatPokerNumber(poker);
    Character[] pokersSuit = PokerFormat.formatPokerSuit(poker);
    Integer[] result = PokerFormat.calcPokerNumber(pokersNumber);
    return verifyPokerType(result, pokersSuit);
  }

  private int verifyPokerType(Integer[] pokersNumber, Character[] pokersSuit) {
    int maxSamePokerNumber = Collections.max(Arrays.asList(pokersNumber));
    if (isStraight(pokersNumber) & isFlush(pokersSuit)) {
      return 8;
    }
    if (maxSamePokerNumber == 4) {
      return 7;
    }
    if (maxSamePokerNumber == 3) {
      return isThreeOfKindOrFullHouse(pokersNumber);
    }
    if (isFlush(pokersSuit)) {
      return 5;
    }
    if (isStraight(pokersNumber)) {
      return 4;
    }
    if (maxSamePokerNumber == 2) {
      return calcPairPokerNumber(pokersNumber);
    }
    return 0;
  }

  private boolean isFlush(Character[] pokersSuit) {
    Character firstPokerSuit = pokersSuit[0];
    for (Character character : pokersSuit) {
      if (character != firstPokerSuit) {
        return false;
      }
    }
    return true;
  }

  private Boolean isStraight(Integer[] pokersNumber) {
    int count = 0;
    for (Integer integer : pokersNumber) {
      if (integer != 0) {
        count++;
      }
      if (count == 5) {
        return true;
      }
      if (count != 0 && integer == 0) {
        break;
      }
    }
    return false;
  }

  private int isThreeOfKindOrFullHouse(Integer[] pokersNumber) {
    for (Integer integer : pokersNumber) {
      if (integer == 2) {
        return 6;
      }
    }
    return 3;
  }

  private int calcPairPokerNumber(Integer[] pokersNumber) {
    int pairPokerNumber = 0;
    for (Integer integer : pokersNumber) {
      if (integer == 2) {
        pairPokerNumber++;
      }
    }
    return pairPokerNumber;
  }
}

