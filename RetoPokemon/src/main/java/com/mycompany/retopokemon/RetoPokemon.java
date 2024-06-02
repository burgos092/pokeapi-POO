/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.retopokemon;
import entities.repositories.Repository;
import entities.Move;
import entities.Type;

 
public class RetoPokemon {

    
    public static void main(String[] args) {
       
        Repository<Move> moveRepository = new Repository<Move>();
        Repository<Type> typeRepository = new Repository<Type>();
        
        Move move1 = new Move(1, "Punch",50);
        Move move2 = new Move(2, "Kick",70);
        Move move3 = new Move(3, "Ember",40);
        Move move4 = new Move(4, "ThunderShock",40);
        
        
        
     
        Type type1 = new Type(1, "Fire");
        type1.addMove(move3);
        type1.addMove(move4);
        
   
        moveRepository.put(move1.getName(),move1);
        moveRepository.put(move2.getName(),move2);
        moveRepository.put(move3.getName(),move3);
        moveRepository.put(move4.getName(),move4);
        
        typeRepository.put(type1.getName(), type1);
        
        
        System.out.println("----------Moves----------");
        
        System.out.println(moveRepository.get("Punch").toString());
        System.out.println(moveRepository.get("Kick").toString());
        System.out.println(moveRepository.get("Ember").toString());
        System.out.println(moveRepository.get("ThunderShock").toString());
     
        System.out.println("----------Moves----------");
        
          
       
        System.out.println("----------Types----------");
        
        System.out.println(typeRepository.get("Fire").toString());
        
        System.out.println("----------Types----------");
           
                
    }
    
}
