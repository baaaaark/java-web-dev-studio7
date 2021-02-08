package org.launchcode.studio7;

import java.util.HashMap;

public class CD extends BaseDisc {

    HashMap<String, String> cdInfo = new HashMap();

    @Override
    public void spinDisc() {
        if (!trayIsOpen && diskIsInside) {
            System.out.println("You hear the sound of a motor start to spin at 200 to 500 RPM");
        }
    }

    @Override
    public void dataStore() {
        if (laserIsWriting) {
            System.out.println("The laser burns zeroes and ones into the disc using the proper CD protocols");
        }
    }

    @Override
    public void laserWrite() {
        System.out.println("Writing to CD using appropriate formats");
    }

    @Override
    public void laserRead() {
        System.out.println("Reading CD to watch video");
    }

    @Override
    public HashMap<String, String> reportInformation() {

        return cdInfo;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
