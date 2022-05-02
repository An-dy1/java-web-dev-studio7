package org.launchcode.studio7.complete;

public interface OpticalDisc {

  // constants
  int cdMaxSpeed = 300;
  int dvdMaxSpeed = 600;

  // cannot have a body, but can have parameters
  // these have to be implemented
  void spinDisc();

  // a default method can have a body
  // allow you to add functionality after interface has been implemented
  default int spinDiscMaxSpeed(String discType) {
    System.out.println("I am a static method called from the interface");
    if(discType == "CD") {
      System.out.println(String.format("CDs can spin up to %o rpm", cdMaxSpeed));
      return cdMaxSpeed;
    } else {
      System.out.println(String.format("DVDS can spint up to %o rpm", dvdMaxSpeed));
      return dvdMaxSpeed;
    }
  }

  // static method can have a body
  // describe behavior that is associated with the class in which it is defined rather than with any object
  static int getCdMaxSpeed() {
    System.out.println(cdMaxSpeed);
    return cdMaxSpeed;
  }

}
