package org.launchcode.studio7;

import java.util.HashMap;

public interface OpticalDisc {

    int SATASPEED = 1500000000; //in Hz
    String FIRMWAREVERSION = "1.0.3.165";

    void spinDisc();
    void dataStore();  //should pass value to reportInformation()
    void laserWrite();
    void laserRead();
    void reportInformation();  //will store disc info in key: value pairs
    String discTypeCheck();
    void discTrayOpenClose();

}
