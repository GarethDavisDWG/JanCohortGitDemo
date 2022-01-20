package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String PaintName = "Classy";
        int PaintCoveragePerCanSqrMeter = 10;
        int wall1LengthInMm = 2000;
        int wall1HeightInMm = 2000;
        int wall1AreaInMeterSqr = (wall1HeightInMm/1000) * (wall1LengthInMm/1000);
        int tinsNeeded = wall1AreaInMeterSqr / PaintCoveragePerCanSqrMeter;
        if (wall1AreaInMeterSqr%PaintCoveragePerCanSqrMeter!=0)
        {
            tinsNeeded++;
        }
        PaintName.length();
        double e = (double)10/4;
        double d = Math.ceil(e);
        System.out.println("we need "+tinsNeeded+" tins of paint");
    }
}
