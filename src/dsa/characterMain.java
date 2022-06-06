/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author JiaWen
 */

public class characterMain extends characteristic{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        LinkedList <characteristic> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int size = 0;
        
        String file_path = "C:/Users/User/Documents/y1s2 ds/DS/DS assignment/characteristics.txt";
        
        //2.1
        //store and print data 
        try{
            File f =new File(file_path);
            Scanner inputStream = new Scanner(new FileInputStream(f));
            boolean isAdded = false;
           
            while(inputStream.hasNextLine()){
                String name = inputStream.nextLine();
                int height = Integer.parseInt(inputStream.nextLine());
                int weight = Integer.parseInt(inputStream.nextLine());
                int strength = Integer.parseInt(inputStream.nextLine());
                int agility = Integer.parseInt(inputStream.nextLine());
                int intelligence = Integer.parseInt(inputStream.nextLine());
                int coordination = Integer.parseInt(inputStream.nextLine());
                int leadership = Integer.parseInt(inputStream.nextLine());
                size++;
                
                characteristic character = new characteristic(name, height, weight, strength, agility, intelligence, coordination, leadership);
                isAdded = list.add(character);
                System.out.println(character.toString());
                System.out.println();
                
                if(isAdded){
                    continue;
                }else{
                    System.out.println("Not added!");
                    break;
                }
                
            }
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        
        //2.2 
        //Sorting attributes
        characteristic[] array = list.toArray(new characteristic[list.size()]);
        String[] Name = new String[list.size()];
        int[] Height = new int[list.size()];
        int[] Weight = new int[list.size()];
        int[] Strength=new int[list.size()];
        int[] Agility=new int[list.size()];
        int[] Intelligence=new int[list.size()];
        int[] Coordination=new int[list.size()];
        int[] Leadership=new int[list.size()];
        
        
        for(int i=0;i<list.size();i++){
            Name[i] = list.get(i).getName();
            Height[i] = list.get(i).getHeight();
            Weight[i] = list.get(i).getWeight();
            Strength[i] = list.get(i).getStrength();
            Agility[i] = list.get(i).getAgility();
            Intelligence[i] = list.get(i).getIntelligence();
            Coordination[i] = list.get(i).getCoordination();
            Leadership[i] = list.get(i).getLeadership();
        }
        
        boolean status = true;
        //Sort using comparator
        do{
            System.out.print("Sorting attribute: ");
            String attribute = sc.nextLine();
            
            if(attribute.isEmpty()){
                break;
                
            }else if(attribute.equalsIgnoreCase("Height")){
                System.out.println("======= Rank of Height =======");
                list.sort(Comparator.comparing(characteristic::getHeight).reversed());                
                list.forEach(c -> {
                    System.out.println(c.getName() + " " + c.getHeight());
                });
                
            }else if(attribute.equalsIgnoreCase("Weight")){
                System.out.println("======= Rank of Weight =======");
                list.sort(Comparator.comparing(characteristic::getWeight).reversed());                
                list.forEach(c -> {
                    System.out.println(c.getName() + " " + c.getWeight());
                });
               
            }else if(attribute.equalsIgnoreCase("Strength")){
                System.out.println("======= Rank of Strength =======");
                list.sort(Comparator.comparing(characteristic::getStrength).reversed());                
                list.forEach(c -> {
                    System.out.println(c.getName() + " " + c.getStrength());
                });
                
            }else if(attribute.equalsIgnoreCase("Agility")){
                System.out.println("======= Rank of Agility =======");
                list.sort(Comparator.comparing(characteristic::getAgility).reversed());                
                list.forEach(c -> {
                    System.out.println(c.getName() + " " + c.getAgility());
                });
                
            }else if(attribute.equalsIgnoreCase("Intelligence")){
                System.out.println("======= Rank of Intelligence =======");
                list.sort(Comparator.comparing(characteristic::getIntelligence).reversed());                
                list.forEach(c -> {
                    System.out.println(c.getName() + " " + c.getIntelligence());
                });
            
            }else if(attribute.equalsIgnoreCase("Coordination")){
                System.out.println("======= Rank of Coordination =======");
                list.sort(Comparator.comparing(characteristic::getCoordination).reversed());                
                list.forEach(c -> {
                    System.out.println(c.getName() + " " + c.getCoordination());
                });
            
            }else if(attribute.equalsIgnoreCase("Leadership")){
                System.out.println("======= Rank of Leadership =======");
                list.sort(Comparator.comparing(characteristic::getLeadership).reversed());                
                list.forEach(c -> {
                    System.out.println(c.getName() + " " + c.getLeadership());
                });
            }
           System.out.println();
            if(attribute.equalsIgnoreCase("quit"))
                status = false;
          
            
        }while(status);
         
        //binary search
        do{
            System.out.print("Finding ability: ");
            String ability = sc.nextLine();
            System.out.print("\nvalue:");
            int value = sc.nextInt();
            
            if(ability.isBlank()){
                  break;
                  
            }else if(ability.equalsIgnoreCase("Strength")){   
                  System.out.print("\nSoldier: ");
                for (int i = 0; i < list.size(); i++) 
                    if(value == Strength[i]){
                        System.out.print(Name[i] + " ");
                    }
                
            }else if(ability.equalsIgnoreCase("Agility")){   
                  System.out.print("\nSoldier: ");
                for (int i = 0; i < list.size(); i++) 
                    if(value == Agility[i]){
                        System.out.print(Name[i] + " ");
                    }
                
            }else if(ability.equalsIgnoreCase("Intelligence")){   
                  System.out.print("\nSoldier: ");
                for (int i = 0; i < list.size(); i++) 
                    if(value == Intelligence[i]){
                        System.out.print(Name[i] + " ");
                    }
                
            }else if(ability.equalsIgnoreCase("Coordination")){   
                  System.out.print("\nSoldier: ");
                for (int i = 0; i < list.size(); i++) 
                    if(value == Coordination[i]){
                        System.out.print(Name[i] + " ");
                    }
                
            }else if(ability.equalsIgnoreCase("Leadership")){   
                  System.out.print("\nSoldier: ");
                for (int i = 0; i < list.size(); i++) 
                    if(value == Leadership[i]){
                        System.out.print(Name[i] + " ");
                    }
            }
            
            System.out.println();
            if(ability.equalsIgnoreCase("quit"))
                status = false;

        }while(status);
        
    }

  
 
    
}
