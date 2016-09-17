/*
 * Copyright (c) 2016. Mike Baranski - all rights reserved.
 */

package net.mikeski.ejb_annotations;

import javax.ejb.Stateless;

@AfterComplete
@Stateless
public class AfterCompleteErrPrinter implements IAfterComplete{

  public void afterComplete(String someValue) {
    System.err.println(someValue);
  }
}
