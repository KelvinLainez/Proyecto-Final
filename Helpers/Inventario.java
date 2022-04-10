/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author pc
 */
public abstract class Inventario {
    public int cantidad;
    
    public int cantidadTotal;
    private String producto;
    public String marca;

public Inventario(){
}
public Inventario(String _producto, String _marca){
 this.setProducto(_producto);
 this.setMarca(_marca);
 
}

public void setProducto(String _producto){
this.producto=_producto;
}
public void setMarca(String _marca){
this.marca=_marca;
}
 

public String getProducto(){
return this.producto;
}
public String getMarca(){
return this.marca;
}

abstract String mostrarProducto();
abstract String mostrarMarca();
abstract int mostrarCantidadInicial();
}
