package org.launchcode.studio7.complete;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{

  private ArrayList<String> trackList = new ArrayList<>();

  public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
    super(aName, maxCapacity, aType, someUsedCapacity);
  }

  @Override
  public int printNumberOfTotalSections() {
    System.out.println(String.format("This CD has %o tracks on it", trackList.size()));
    return trackList.size();
  }

  @Override
  public void spinDisc() {
    System.out.println("Weee! This is an interface-declared method implemented by the CD class");
  }

  public ArrayList<String> getTrackList() {
    return trackList;
  }

  public void setTrackList(ArrayList<String> trackList) {
    this.trackList = trackList;
  }
}
