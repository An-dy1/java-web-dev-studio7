package org.launchcode.studio7.complete;

public interface OpticalDisc {

  // constants
  int cdMaxSpeed = 300;
  int dvdMaxSpeed = 600;

  // cannot have a body, but can have parameters
  // these have to be implemented
  void spinDisc();

  // a default method can have a body
  default int spinDiscMaxSpeed(String discType) {
    if(discType == "CD") {
      return cdMaxSpeed;
    } else {
      return dvdMaxSpeed;
    }
  }

  // static method can have a body
  static int getCdMaxSpeed() {
    System.out.println(cdMaxSpeed);
    return cdMaxSpeed;
  }

}
