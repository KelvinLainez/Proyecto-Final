/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author pc
 */
public class Zapatos extends Inventario{
    public int cantidadInicial=325;

public Zapatos(){

}

public Zapatos(String _producto, String _marca){
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
   return "Zapatos";
}

 @Override
   public String mostrarMarca(){
   return "Prada";
}

 @Override
   public int mostrarCantidadInicial(){
   return cantidadInicial+cantidad;
}

}
