package org.launchcode.studio7.incomplete;

public interface OpticalDisc {

  int discSpinMaxSpeed = 500;

  void spinDisc();

  default int returnMaxSpeed() {
    return discSpinMaxSpeed;
  }
}
