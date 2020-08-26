package com.pokerHands;

import java.util.Arrays;

public class PokerType {

  public String[] verifyPokerType(String[] poker) {
    Character[] pokersNumber = Arrays.stream(poker).map(s -> s.charAt(0)).toArray(Character[]::new);
    String[] result = calcPairNumber(pokersNumber);
    if ("1".equals(result[0])) {
      result[0] = "pair";
    }
    if ("2".equals(result[0])) {
      result[0] = "two pairs";
    }
    return result;
  }

  public String[] calcPairNumber(Character[] pokersNumber) {
    char maxPairNumber = '0';
    int repetitionNumber = 0;
    String[] result = new String[2];
    for (int i = 0; i < pokersNumber.length - 1; i++) {
      Character temp = pokersNumber[i];
      for (int j = i + 1; j < pokersNumber.length; j++) {
        if (temp.equals(pokersNumber[j])) {
          if (maxPairNumber == temp) {
            repetitionNumber--;
            continue;
          }
          if (maxPairNumber < temp) {
            result[1] = String.valueOf(temp);
            maxPairNumber = temp;
          }
          repetitionNumber ++;
        }
      }
    }
    result[0] = String.valueOf(repetitionNumber);
    return result;
  }
}
