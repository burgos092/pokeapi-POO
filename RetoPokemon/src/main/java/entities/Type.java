/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class Type {
    private int id;
    private String name;
    private List<Move> moves;

    // Constructor
    public Type(int id, String name) {
        this.id = id;
        this.name = name;
        this.moves = new ArrayList<>();
    }

    
   


    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public List<Move> getMoves() {
        return new ArrayList<>(moves); // Devolvemos una copia para evitar modificaciones externas
    }

    public void setMoves(List<Move> moves) {
        this.moves = new ArrayList<>(moves); // Clonamos la lista para evitar modificaciones externas
    }

    // Método para agregar un movimiento
    public void addMove(Move move) {
        this.moves.add(move);
    }

    // Método para eliminar un movimiento
    public void removeMove(Move move) {
        this.moves.remove(move);
    }
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", moves=" + moves +
                '}';
    }

    
}
