/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author axel5
 */
public class Empleado extends Persona {
        private String Codigo_empleado;
        private String puesto;

        // GETTERS AND SETTERS DE ESTE MODELO
    public String getCodigo_empleado() {
        return Codigo_empleado;
    }

    public void setCodigo_empleado(String Codigo_empleado) {
        this.Codigo_empleado = Codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    // SOBREESCRIBIR EL METODO XD
    @Override
    public void agregar(){ 
         System.out.println("Codigo empleado:"+ this.getCodigo_empleado());
         System.out.println("Puesto:"+ this.getPuesto());
         // cuando heredo de persona aparecen los metodos ya que uso el encapsulamiento
         System.out.println("Nombres:"+this.getNombres());
          System.out.println("Apellidos:"+this.getApellidos());
          System.out.println("Dirección:"+this.getDireccion());
          System.out.println("Telefono:" + this.getTelefono());
          System.out.println("Fecha de nacimiento:"+this.getFecha_nacimiento());


    }
    
}
        
        


