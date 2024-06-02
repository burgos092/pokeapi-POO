/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities.repositories;
import java.util.HashMap;
import java.util.Map;


public class Repository<T> {
    
    private Map<String, T> data;
    
    public Repository(){
        this.data = new HashMap<>();
    }
    
 
    public void put (String key, T entity){
        this.data.put(key, entity);
    }
    
     public T get(String key){
         return (this.data.containsKey(key)) ? this.data.get(key) : null;
     
     }

  
}
