/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9_lu;

/**
 *
 * @author UCC20411
 */
public class Brujo {
    public String nombre;
    public Mascota pet;
    
    public void Mostrar(){
    
        System.out.println("El mascota del brujo "+ this.nombre + " es: " + 
                this.pet.nombre + " ("+this.pet.tipo+")");
    }
}
