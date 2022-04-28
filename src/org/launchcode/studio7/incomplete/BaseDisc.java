package org.launchcode.studio7.incomplete;

public abstract class BaseDisc {

  private String discName;
  private int discCapacity;
  private int yearReleased;

  public BaseDisc(String discName, int discCapacity, int yearReleased) {
    this.discName = discName;
    this.discCapacity = discCapacity;
    this.yearReleased = yearReleased;
  }

  public void reportDiscInformation() {
    System.out.println(discName);
  }

  abstract void fastForward();
}
