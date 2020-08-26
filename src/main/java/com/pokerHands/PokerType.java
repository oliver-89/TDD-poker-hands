package com.pokerHands;

import java.util.Arrays;
import java.util.Collections;

public class PokerType {

  public int packPokerType(String[] poker) {
    Character[] pokersNumber = Arrays.stream(poker).map(s -> s.charAt(0)).toArray(Character[]::new);
    Integer[] pokers = pokerToNumber(pokersNumber);
    Integer[] result = calcPokerNumber(pokers);
    int pokerType = verifyPokerType(result);
    return pokerType;
  }

  private Integer[] calcPokerNumber(Integer[] pokersNumber){
    Integer[] poker = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    for (int i = 0; i < pokersNumber.length; i++) {
      poker[pokersNumber[i] - 1] ++;
    }
    return poker;
  }

  private int verifyPokerType(Integer[] pokersNumber) {
    int maxSamePokerNumber = (int) Collections.max(Arrays.asList(pokersNumber));
    int pairPokerNumber = 0;
    if (maxSamePokerNumber == 2) {
      for (int i = 0; i < pokersNumber.length; i++) {
        if (pokersNumber[i] == 2) {
          pairPokerNumber ++;
        }
      }
      return pairPokerNumber;
    }
    if (maxSamePokerNumber == 3) {
      for (int i = 0; i < pokersNumber.length; i++) {
        if (pokersNumber[i] == 2) {
          return 6;
        }
      }
      return maxSamePokerNumber;
    }
    if (maxSamePokerNumber == 4) {
      return 7;
    }
    return pairPokerNumber;
  }

  private Integer[] pokerToNumber(Character[] pokersNumber) {
    return Arrays.stream(pokersNumber).map(pokerNumber -> {
      if (pokerNumber == 'A') {
        return 14;
      }
      if (pokerNumber == 'T') {
        return 10;
      }
      if (pokerNumber == 'J') {
        return 10;
      }
      if (pokerNumber == 'Q') {
        return 10;
      }
      if (pokerNumber == 'K') {
        return 10;
      }
      return Integer.parseInt(String.valueOf(pokerNumber));
    }).toArray(Integer[]::new);
  }
}
//
//  public String[] calcPairPokerNumber(Character[] pokersNumber) {
//    char maxPairNumber = '0';
//    int repetitionNumber = 0;
//    String[] result = new String[2];
//    for (int i = 0; i < pokersNumber.length - 1; i++) {
//      Character temp = pokersNumber[i];
//      for (int j = i + 1; j < pokersNumber.length; j++) {
//        if (temp.equals(pokersNumber[j])) {
//          if (maxPairNumber < temp) {
//            result[1] = String.valueOf(temp);
//            maxPairNumber = temp;
//          }
//          repetitionNumber ++;
//        }
//      }
//    }
//    result[0] = String.valueOf(repetitionNumber);
//    return result;
//  }
////
////  public String[] verifyFourNumber(Character[] pokersNumber) {
////    int repetitionNumber = 0;
////    String[] result = new String[2];
////    for (int i = 0; i < pokersNumber.length - 1; i++) {
////      Character temp = pokersNumber[i];
////        if (temp.equals(pokersNumber[j])) {
////          result[1] = String.valueOf(pokersNumber[j]);
////          repetitionNumber ++;
////        }
////    }
////    result[0] = String.valueOf(repetitionNumber);
////    return result;
////  }

