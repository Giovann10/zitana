package com.greenfoxacademy.workshop.arrayhandler;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ArrayHandler {

  public Object sendResult(ArrayRequest arrayRequest) {
    if (arrayRequest.getWhat().equals("sum")) {
      int result = 0;
      for (int number : arrayRequest.getNumbers()) {
        result += number;
      }
      return new IntResult(result);
    } else if (arrayRequest.getWhat().equals("multiply")) {
      int result = 1;
      for (int number : arrayRequest.getNumbers()) {
        result *= number;
      }
      return new IntResult(result);
    } else if (arrayRequest.getWhat().equals("double")) {
      int[] resultArray = arrayRequest.getNumbers();
      for (int i = 0; i < resultArray.length; i++) {
        resultArray[i] = resultArray[i]*2;
      }
      return new ArrayResult(resultArray);
    } else {
      return new Error("Oooops, something went wrong!");
    }
  }

}
