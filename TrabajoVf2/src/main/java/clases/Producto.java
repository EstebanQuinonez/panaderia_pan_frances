package clases;

import java.io.Serializable;

/**
 * Esta clase define objetos de tipo Producto con un
 * productoN a modo de identificador del producto, tipo,
 * descripcionProducto, precioUnitProducto.
 */
public class Producto implements Serializable {
    
        private int productoN=0; //Atributo que identifica el producto con un codigo
        private String tipo;     //Atributo que define el tipo de producto
        private String descripcionProducto; //Atributo que define una breve descripcion del producto
        private double precioUnitProducto;  //Atributo que define el precio unitario del producto 

        /**
         * Constructor sin parametros de la clase Producto
         */
        public Producto()   {
        }


        /**
         * Contructor con parametros de la clase Producto
         * @param tipo Parametro que define el tipo de producto
         * @param descripcionProducto Parametro que define la descripcion del producto
         * @param precioUnitProducto Parametro que define el precio unitario del producto
         */
        public Producto( String descripcionProducto, String tipo, double precioUnitProducto) {

            this.tipo = tipo;
            this.descripcionProducto = descripcionProducto;
            this.precioUnitProducto = precioUnitProducto;
        }


        /**
         * Método que devuelve el identificador del producto
         * @return El productoN de un producto
         */
        public int getProductoN() {
            return productoN;
        }


        /**
         * Método que establece el identificador del producto
         * @param productoN Parametro que define el productoN de un producto
         */
        public void setProductoN(int productoN) {
            this.productoN = productoN;
        }


        /**
         * Método que devuelve el tipo de un producto
         * @return El tipo de  producto
         */
        public String getTipo() {
            return tipo;
        }


        /**
         * Método que establece el tipo de un producto
         * @param tipo Parametro que define el tipo de producto
         */
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }


        /**
         * Método que devuelve la descripcion de un producto
         * @return La descripcion del producto
         */
        public String getDescripcionProducto() {
            return descripcionProducto;
        }


        /**
         * Método que establece la descipcion del producto
         * @param descripcionProducto Parametro que define la descripcion del producto
         */
        public void setDescripcionProducto(String descripcionProducto) {
            this.descripcionProducto = descripcionProducto;
        }


        /**
         * Método que devuelve el precio unitario de un producto
         * @return El precio unitario de un producto
         */
        public double getPrecioUnitProducto() {
            return precioUnitProducto;
        }


        /**
         * Método que establece el precio unitario de un producto
         * @param precioUnitProducto Parametro que define el precio unitario de un producto.
         */
        public void setPrecioUnitProducto(double precioUnitProducto) {
            this.precioUnitProducto = precioUnitProducto;
        }


        /**
         * Método que devuelve un mensaje con la información del producto en pantalla
         * @return La informacion completa de un producto. 
         */
        @Override
        public String toString() {
            return "\nIdPRODUCTO   " + getProductoN() + "      DESCRIPCION:   " + getDescripcionProducto()+ "     TIPO:    " + getTipo()+ "     COSTO UNITARIO: " +  getPrecioUnitProducto() + "\n";
        }
    
}
