/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author axel5
 */
public class Cliente extends Persona {
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    
    // METODOS SOBREESCRITOS DE PERSONA
    @Override
    public void agregar(){ 
         System.out.println("Nit:"+ getNit());
         // cuando heredo de persona aparecen los metodos ya que uso el encapsulamiento
         System.out.println("Nombres:"+this.getNombres());
          System.out.println("Apellidos:"+this.getApellidos());
          System.out.println("Dirección:"+this.getDireccion());
          System.out.println("Telefono:" + this.getTelefono());
          System.out.println("Fecha de nacimiento:"+this.getFecha_nacimiento());


    }
    
}
