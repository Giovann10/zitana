package com.greenfoxacademy.workshop.arrayhandler;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ArrayHandler {

  public Object sendResult(ArrayRequest arrayRequest) {
    int result = 0;
    List<Integer> resultArray = new ArrayList<>();
    if (arrayRequest.getWhat().equals("sum")) {
      for (int number : arrayRequest.getNumbers()) {
        result += number;
      }
      return new IntResult(result);
    } else if (arrayRequest.getWhat().equals("multiply")) {
      for (int number : arrayRequest.getNumbers()) {
        result *= number;
      }
      return new IntResult(result);
    } else if (arrayRequest.getWhat().equals("double")) {
      for (int number : arrayRequest.getNumbers()) {
        resultArray.add(number * 2);
      }
      return new ArrayResult(resultArray);
    } else {
      return new IntResult(-1);
    }
  }
}
