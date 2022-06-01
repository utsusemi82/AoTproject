/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.Random;

/**
 *
 * @author Yap Yoong Siew
 */
public class Titans {
    private boolean normal;
    private int height;
    private int legs;
    private int speed;
    private int walk;
    private int climb;
    private int risk;
    private int index;
    private String normalString;
    private String heightString;
    private String legsString;
    private String speedString;
    private String walkString;
    private String climbString;
    private String riskString;
    
    //constructor for normal titan
    public Titans(boolean normal, int height, int legs, int speed, int walk, int climb, int index) {
        Random r = new Random();
        this.normal = normal;
        this.height = height;
        this.legs = legs;
        this.speed = speed;
        this.walk = walk;
        this.climb = climb;
        this.index = index;
        this.risk = height+legs+speed+walk+climb;
    }

    //constructor for abnormal titans
    public Titans(boolean normal, int risk, int index) {
        this.normal = normal;
        this.risk = risk; //15 or 19
        this.index = index;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWalk(int walk) {
        this.walk = walk;
    }

    public void setClimb(int climb) {
        this.climb = climb;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isNormal() {
        return normal;
    }

    public int getHeight() {
        return height;
    }

    public int getLegs() {
        return legs;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWalk() {
        return walk;
    }

    public int getClimb() {
        return climb;
    }

    public int getRisk() {
        return risk;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        Random r = new Random();
        
        
        
        if(normal){
            normalString = "Normal Titan";
            
            heightString = switch (height) {
                case 1 -> Integer.toString(r.nextInt(10));
                case 2 -> Integer.toString(11 + r.nextInt(10));
                case 3 -> Integer.toString(21 + r.nextInt(10));
                default -> null;
            };
            
            legsString = switch (legs) {
                case 1 -> "0 legs";
                case 2 -> "2 legs";
                case 3 -> "4 legs";
                default -> null;
            };
            
            speedString = switch (speed) {
                case 1 -> Integer.toString(r.nextInt(10));
                case 2 -> Integer.toString(11 + r.nextInt(10));
                case 3 -> Integer.toString(21 + r.nextInt(10));
                default -> null;
            };
            
            walkString = switch (walk) {
                case 1 -> "Normal pattern";
                case 2 -> "Repeated pattern";
                case 3 -> "Not repeated pattern";
                default -> null;
            };
            
            climbString = switch (climb) {
                case 1 -> "Cannot Climb";
                case 3 -> "Can Climb";
                default -> null;
            };
            
            riskString = switch (risk){
                default -> Integer.toString(risk);
            };
        
            return "Titan " + index + ": " + heightString + "m, " +
                    legsString +  ", " + speedString + "ms, " + walkString +
                    ", " + climbString + ") Risk=" + riskString;
        }
        else{
            normalString = "abnormal Titan";
            return "Titan " + index + ": " + normalString + " Risk=" + risk;
        }
    }
}
