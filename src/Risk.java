/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 02/11/2020
 *
 */

//Test driven

public class Risk {
    private String description;
    private String consequence;
    private Probability probabilityLevel; // LOW, MEDIUM; HIGH
    private double probabilityPercent; //0..1

    Risk(){
        probabilityPercent = 0.001; // all new Risk objects have default probabilityPercent set to 0.001.
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    public Probability getProbabilityLevel() {
        return probabilityLevel;
    }

    public void setProbabilityLevel(Probability probabilityLevel) {
        this.probabilityLevel = probabilityLevel;
    }

    public double getProbabilityPercent() {
        return probabilityPercent;
    }

    public void setProbabilityPercent(double probabilityPercent) {
        this.probabilityPercent = probabilityPercent;
    }

    public String hello(){
        return "Hello!";
    }
}
