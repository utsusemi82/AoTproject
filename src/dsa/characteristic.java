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
    private int height, weight, strength, ability, intelligence, coordination, leadership;

    public characteristic() {
    }

    public characteristic(String name, int height, int weight, int strength, int ability, int intelligence, int coordination, int leadership) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.ability = ability;
        this.intelligence = intelligence;
        this.coordination = coordination;
        this.leadership = leadership;
    }

    

    
    
    @Override
    public String toString() {
        return "Name: " + name + 
               "\nHeight: " + height + "cm" + 
               "\nWeight: " + weight + "kg" +
               "\nStrength: " + strength + 
               "\nAbility: " + ability + 
               "\nIntelligence: " + intelligence +
               "\nCoordination: " + coordination + 
               "\nLeadership: " + leadership ;
    }
    
    
}
