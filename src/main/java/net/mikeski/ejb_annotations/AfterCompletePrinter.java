/*
 * Copyright (c) 2016. Mike Baranski - all rights reserved.
 */

package net.mikeski.ejb_annotations;

import javax.ejb.Stateless;

@AfterComplete
@Stateless
public class AfterCompletePrinter implements IAfterComplete {

  public void afterComplete(String someValue) {
    System.out.println("After complete printer: " + someValue);
  }

}
