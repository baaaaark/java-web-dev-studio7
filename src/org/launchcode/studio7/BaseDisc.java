package org.launchcode.studio7;

import java.util.HashMap;

public class BaseDisc implements OpticalDisc {

    public Boolean trayIsOpen;
    public boolean diskIsInside;
    public String discType;
    public boolean laserIsReading;
    public boolean laserIsWriting;


    @Override
    public void discTrayOpenClose() {

        if (trayIsOpen) {
            trayIsOpen = false;
        }
        else {
            trayIsOpen = true;
        }
    }

    @Override
    public String discTypeCheck() {
        if (!trayIsOpen && diskIsInside) {
            return discType;
        }
        else {return "Error reading data";}
    }

    @Override
    public void reportInformation() { }

    @Override
    public void spinDisc() { }

    @Override
    public void dataStore() { }

    @Override
    public void laserWrite() { }

    @Override
    public void laserRead() { }


}
