package clases;

import java.util.ArrayList;
import java.io.*;

/**
 * Esta clase denominada Inventario modela un inventario de productos 
 * con los atributos tipoInventario, un nElemento y un arraylist de productos.
 * descripcionProducto, precioUnitProducto.
 */
public class Inventario implements Serializable{
    
    
        private String tipoInventario; /*Atributo que define el tipo de 
        inventario.*/
        private int nElemento=0; /*Atributo que define el numero de elemento del
        inventario
        */
        private ArrayList<Producto> registroProducto;/*Atributo que define un arraylist de 
        productos.
        */


        /**
         * Constructor de la clase Inventario
         * @param tipoInventario Parametro que define el tipo de inventario.
         */
            public Inventario(String tipoInventario) {
            this.tipoInventario = tipoInventario;
            registroProducto = new ArrayList<>(); //Se crea el arraylist de Productos
        }


        /**
         * Método que devuelve el tipo de inventario
         * @return El tipo de inventario.
         */
        public String getTipoInventario() {
            return tipoInventario;
        }


        /**
         * Método que establece el tipo de inventario
         * @param tipoInventario Parametro que define el tipo de inventario
         */
        public void setTipoInventario(String tipoInventario) {
            this.tipoInventario = tipoInventario;
        }


        /**
         * Método que establece el arraylist
         * @param registroProducto Parametro que define un arraylist de tipo producto
         */
          public void setRegistroProducto(ArrayList<Producto> registroProducto) {
            this.registroProducto = registroProducto;
        }


        /**
         * Método que devuelve el arraylist de productos del Inventario
         * @return El registroProducto 
         */
         public ArrayList<Producto> getRegistroProductos() {
            return registroProducto;
        }


        /**
         * Método que añade un producto al inventario.
         * @param productos Parámetro que define el producto quese
         * agregará al arraylist de productos del inventario.
         */
        public void añadirElemento(Producto productos){  
                registroProducto.add(productos);
                productos.setProductoN(++nElemento);   
        }   


        /**
         * Método que modifica los datos de un producto del inventario de productos.
         * @param elementoN Parametro que identifica al producto a modificar
         * @param descripcion Parametro que redefine la descripcion del producto a modificar.
         * @param tipo Parametro que redefine el tipo de productoa modificar.
         * @param precioUnitProducto Parametro que redefine el precio unitario del producto a modificar.
         */
        public void modificarElemento(int elementoN, String descripcion, String tipo, double precioUnitProducto ){
            for(Producto prod : registroProducto){
                if(prod.getProductoN() == elementoN){
                    prod.setDescripcionProducto(descripcion);
                    prod.setTipo(tipo);
                    prod.setPrecioUnitProducto( precioUnitProducto);
                    break;
                }  
            }
        }


        /**
         * Método que imprime en pantalla los datos de cada producto del 
         * arraylist de productos del Inventario
         */
        public void listadeProductos(){

            System.out.println("LISTA DE PRODUCTOS");

            for(Producto prod : registroProducto){
                System.out.println("ID de producto: " + Integer.toString(prod.getProductoN())  + " Tipo :  " + prod.getTipo() +  "  Descripcion del producto: " + prod.getDescripcionProducto()+ " Costo de Producto: " +  prod.getPrecioUnitProducto()); 
            }  
        }


        /**
         * Método que elimina un producto del arraylist de productos del Inventario
         * @param elementoN Parametro que identifica a un producto.
         */
        public void eliminarElemento(int elementoN){

            for(int i = 0; i < registroProducto.size(); i++){
                if(registroProducto.get(i).getProductoN() == elementoN){
                    registroProducto.remove(i);
                    break;
                }
            }
        }


        /**
         * Método que devuelve la cantidad de productos registrados en el arraylist de productos
         * del Inventario
         * @return 
         */
         public int cantidadProductos(){
            nElemento = registroProducto.size();
            return nElemento;
        }


        /**
        * Metodo que añade elementos de tipo Producto que contiene el objeto de 
        * la clase Inventario a otro objeto de tipo Inventario
        * y elimina el que se encontraba en el primero objeto de tipo Inventario 
        * Añade elementos a la canasta de pedidos y los elimina del enventario de productos.
        * @param idProducto Parametro que define el identificador del producto
        * @param pedidos Parametro que define un objeto de la clase Inventario
        */
        public void creandoCarritoCompra(int idProducto, Inventario pedidos ){

            for(int i = 0 ; i<this.registroProducto.size();i++){
                if(this.registroProducto.get(i).getProductoN() == idProducto){
                    if(pedidos.registroProducto.add(registroProducto.get(i))){
                        this.registroProducto.remove(i);
                        break;
                    }else{
                     System.out.println("HUBO UN ERROR");
                     break;
                    }
                }
            }         
         }
   
}
