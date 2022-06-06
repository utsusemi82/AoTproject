/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.io.Serializable;

/**
 *
 * @author JiaWen
 */
public class characteristic implements Serializable{
    private String name;
    private int height, weight, strength, agility, intelligence, coordination, leadership;

    public characteristic() {
    }

    public characteristic(String name, int height, int weight, int strength, int agility, int intelligence, int coordination, int leadership) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.coordination = coordination;
        this.leadership = leadership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int ability) {
        this.agility = ability;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCoordination() {
        return coordination;
    }

    public void setCoordination(int coordination) {
        this.coordination = coordination;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + 
               "\nHeight: " + height + "cm" + 
               "\nWeight: " + weight + "kg" +
               "\nStrength: " + strength + 
               "\nAgility: " + agility + 
               "\nIntelligence: " + intelligence +
               "\nCoordination: " + coordination + 
               "\nLeadership: " + leadership ;
    }
    
    
}
