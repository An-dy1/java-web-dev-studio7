package org.launchcode.studio7.complete;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {

  private ArrayList<String> chapters = new ArrayList<>();
  private boolean isBlueRayCompatible = false;

  public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
    super(aName, maxCapacity, aType, someUsedCapacity);
  }

  @Override
  public int printNumberOfTotalSections() {
    System.out.println(chapters.size());
    return chapters.size();
  }

  @Override
  public void spinDisc() {
    System.out.println("Wee! This is an interface declared method");
  }


  public ArrayList<String> getChapters() {
    return chapters;
  }

  public void setChapters(ArrayList<String> chapters) {
    this.chapters = chapters;
  }

  public void makeBlueRayCompatible() {
    this.isBlueRayCompatible = true;
    System.out.println("I set blue ray compatible to true in a method in the DVD class");
  }
}
