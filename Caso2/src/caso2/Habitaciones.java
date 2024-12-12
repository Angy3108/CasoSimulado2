/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

/**
 *
 * @author angeg
 */
public class Habitaciones {

    //variables de la clase habitacion ID, tipo, precio y estado
    public int ID = 0;
    public String tipo = "";
    public int precio = 0;
    public String estado = "";

    //constructor de la clase habitaciones para asiganar los valores
    public Habitaciones(int ID, String tipo, int precio, String estado) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;

    }

    //getter y setters de las variables de la habitaciones
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
