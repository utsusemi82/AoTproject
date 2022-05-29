/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author JiaWen
 */

public class characterMain {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        characterList<characteristic> list = new characterList<>();
        int count = 0;
        
        try{
            File f =new File("C:\\Users\\User\\Documents\\y1s2 ds\\DS\\DS assignment\\characteristics.txt");
            Scanner inputStream = new Scanner(new FileInputStream(f));
           
            while(inputStream.hasNextLine()){
                String name = inputStream.nextLine();
                int height = Integer.parseInt(inputStream.nextLine());
                int weight = Integer.parseInt(inputStream.nextLine());
                int strength = Integer.parseInt(inputStream.nextLine());
                int ability = Integer.parseInt(inputStream.nextLine());
                int intelligence = Integer.parseInt(inputStream.nextLine());
                int coordination = Integer.parseInt(inputStream.nextLine());
                int leadership = Integer.parseInt(inputStream.nextLine());
                   
                characteristic character = new characteristic(name, height, weight, strength, ability, intelligence, coordination, leadership);
                list.addLast(character);
                count++;
                
            }
            list.display();
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
        
    }
    
}
