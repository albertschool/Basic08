package com.company;

/**
 * The type Airplane.
 */
public class Airplane {
    private static int counter=0;   // count objects of airplane created
    private String name;            // name of pilot
    private int maxPass;            // maximum passengers on airplane
    private int numPass;            // number of passengers on airplane
    private boolean inAirport;      // true if airplane is on ground
    private int id;                 // airplane id

    /**
     * Instantiates a new Airplane.
     *
     * @param newName the pilot name
     */
    public Airplane(String newName) {
        counter ++;
        this.name = newName;
        this.maxPass = 240;
        this.numPass = 0;
        this.inAirport = true;
        this.id = counter;
    }

    /**
     * Instantiates a new Airplane.
     *
     * @param newName    the pilot name
     * @param newmaxPass the max passengers in plane
     */
    public Airplane(String newName, int newmaxPass) {
        counter ++;
        this.name = newName;
        this.maxPass = newmaxPass;
        this.numPass = 0;
        this.inAirport = true;
        this.id = counter;
    }

    /**
     * Instantiates a new Airplane.
     *
     * @param newName    the pilot name
     * @param newmaxPass the max passengers in plane
     * @param newnumPass the number of passengers
     */
    public Airplane(String newName, int newmaxPass, int newnumPass) {
        counter ++;
        this.name = newName;
        this.maxPass = newmaxPass;
        this.numPass = newnumPass;
        this.inAirport = true;
        this.id = counter;
    }

    /**
     * Gets id.
     *
     * @return the plane id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the plane name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets max pass.
     *
     * @return the max passengers
     */
    public int getMaxPass() {
        return maxPass;
    }

    /**
     * Gets num pass.
     *
     * @return the number of passengers
     */
    public int getNumPass() {
        return numPass;
    }

    /**
     * Gets in airport.
     *
     * @return true if plane in airport
     */
    public boolean getInAirport() {
        return inAirport;
    }

    /**
     * Set plane on air.
     */
    public void planeOnAir() {
        this.inAirport=false;
    }

    /**
     * Valid pass boolean.
     *
     * @param num the number of passengers to check
     * @return true if able to fly num of passengers
     */
    public boolean validPass(int num) {
        return (num>=(this.maxPass-this.numPass) && this.inAirport);
    }
}
