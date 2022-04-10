/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author pc
 */
public class Vestidos  extends Inventario {
       public int cantidadInicial=200;
public Vestidos(){

}

public Vestidos(String _producto, String _marca){
this.setProducto(_producto);
this.setMarca(_marca);

}
public void setCantidadTotal(int _cantidadTotal){
     this.cantidadTotal=_cantidadTotal;
}

public int getCantidad(){
cantidadTotal=cantidadInicial+cantidad;
return this.cantidadTotal;
}

  @Override
   public String mostrarProducto(){
   return "Vestidos";
}

 @Override
   public String mostrarMarca(){
   return "Shein";
}

 @Override
   public int mostrarCantidadInicial(){
   return cantidadInicial+cantidad;
}
}
