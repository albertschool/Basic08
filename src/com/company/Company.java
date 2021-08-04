package com.company;

/**
 * The type Company.
 */
public class Company {
    private String name;                            // company name
    private Airplane[] airplanes = new Airplane[20];// company's airplanes
    private int count;                              // number of airplanes in company

    /**
     * Instantiates a new Company.
     *
     * @param newName the company name
     */
    public Company(String newName) {
        this.name = newName;
        for (int i=0; i<airplanes.length; i++) {
            this.airplanes[i] = null;
        }
        this.count = 0;
    }

    /**
     * Pilot exist boolean.
     *
     * @param pilot the pilot's name
     * @return true if the pilot exist in the company
     */
    public boolean pilotExist(String pilot) {
        for (int i=0; i<=count; i++) {
            if (pilot.equals(airplanes[i].getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Pass to fly int.
     *
     * @param num the number of passengers to fly
     * @return the airplane number available, -1 if not available
     */
    public int passToFly(int num) {
        for (int i=0; i<=count; i++) {
            if (airplanes[i].validPass(num)) {
                airplanes[i].planeOnAir();
                return airplanes[i].getId();
            }
        }
        return -1;
    }

    /**
     * Free seats int.
     *
     * @return the sum of free seats in the company's airplanes
     */
    public int freeSeats() {
        int sum = 0;
        for (int i=0; i<=count; i++) {
            if (airplanes[i].getInAirport()) {
                sum+=airplanes[i].getMaxPass()-airplanes[i].getNumPass();
            }
        }
        return sum;
    }
}
