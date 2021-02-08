package org.launchcode.studio7;

import java.util.HashMap;

public class DVD extends BaseDisc{

    HashMap<String, String> dvdInfo = new HashMap();

    public DVD(HashMap<String, String> dvdInfo) {
        this.dvdInfo = dvdInfo;
    }

    @Override
    public void spinDisc() {
        if (!trayIsOpen && diskIsInside) {
            System.out.println("You hear the sound of a motor start to spin at 570 to 1600 RPM");
        }
    }

    @Override
    public void dataStore() {
        if (laserIsWriting) {
            System.out.println("The laser burns zeroes and ones into the disc using the proper DVD protocols");
        }
    }

    @Override
    public void laserWrite() {
        System.out.println("Writing to DVD using appropriate formats");
    }

    @Override
    public void laserRead() {
        System.out.println("Reading DVD to watch video");
    }

    @Override
    public HashMap<String, String> reportInformation() {
        if (laserIsReading)
            HashMap<String, String> output = dvdInfo;
        }

        // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
