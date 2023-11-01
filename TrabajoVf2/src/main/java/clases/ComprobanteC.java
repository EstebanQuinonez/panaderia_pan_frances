package clases;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Esta clase denominada ComprobanteC modela un comprobante de pago 
 * con los atributos de una fechaEmision, una canasta, un total, un idComprobante
 * un efectivo, un vuelto, y además canastaPedida, fechaComp,dnicliente y dni jefe.
 * descripcionProducto, precioUnitProducto.
 */
    public class ComprobanteC implements Serializable{
    
    
        private Date fechaEmision; /*Atributo que define la fecha de emision
        del comprobante*/
        private Inventario canasta; /*Atributo que define una canasta de tipo
        inventario.*/          
        private double total;/* Atributo que define el total a pagar.*/ 
        private String idComprobante;/*Atributo que define el idComprobante*/
        private double efectivo; /* Atributo que define el efectivo con el que 
        el cliente paga */           
        private double vuelto;/*Atributo que define el vuelto del cliente*/ 
        private String canastaPedida, fechaComp, dnicliente,dnijefe; /*Atributos que define 
        canastaPedida, fechaComp, dnicliente y dnijefe en su forma de cadena.*/


        /**
         * Constructor con 2 parametros: tipoInventario y efectivo
         * @param tipoInventario Parametro que define el tipoInventario que conformara la canasta
         * @param efectivo  Parametro que define el efectivo del cliente con que paga su canasta de compra
         */
        public ComprobanteC(String tipoInventario, double efectivo) {
            fechaEmision = new Date();
            this.canasta  =new Inventario(tipoInventario);
            this.efectivo = efectivo;
        }

        
        /**
         * Constructor con varios parametros.
         * @param dnicliente Parametro que define el DNI del cliente en su forma de cadena.
         * @param dnijefe Parametro que define el DNI del jefe de negocio en su forma de cadena.
         * @param fechaComp Parametro que define la fecha de compra en su forma de cadena.
         * @param canastaPedida Parametro que define la canasta de pedidos en su forma de cadena.
         * @param idComprobante Parametro que define el identificador del comprobante de pago en su forma de cadena.
         * @param total Parametro que define el total a pagar por la compra en su forma de cadena.
         * @param efectivo Parametro que define el efectivo con el que paga el cliente en su forma de cadena. 
         * @param vuelto Paramewtro que define el vuelto que se le dá al cliente en su forma de cadena. 
         */
        public ComprobanteC(String dnicliente, String dnijefe,String fechaComp, String canastaPedida, 
                            String idComprobante, double total, double efectivo, double vuelto) 
        {
            this.fechaComp = fechaComp;
            this.canastaPedida  =canastaPedida;
            this.total = total;
            this.idComprobante = idComprobante;
            this.efectivo = efectivo;
            this.vuelto = vuelto;
            this.dnicliente = dnicliente;
            this.dnijefe = dnijefe;
        }

        
        /**
        * Método que devuelve el total de compra.
        * @return total
        */
        public double getTotal() {
            return total;
        }

        
        /**
         * Metodo que establece el total a pagar.
         * @param total Parametro que define el total a pagar.
         */
        public void setTotal(double total) {
            this.total = total;
        }

        
        /**
         * Metodo que devuelve el identificador del comprobante de pago.
         * @return idComprobante
         */
        public String getIdComprobante() {
            return idComprobante;
        }


        /**
         * Metodo que devuelve el efectivo con el que el cliente paga su compra.
         * @return efectivo 
         */    
        public double getEfectivo() {
            return efectivo;
        }

        
        /**
         * Metodo que establece el efectivo con el que el cliente paga. 
         * @param efectivo Parametro que define el efectivo del cliente.
         */
        public void setEfectivo(double efectivo) {
            this.efectivo = efectivo;
        }

        
        /**
         * Metodo que devuelve el vuelto del cliente.
         * @return vuelto
         */
        public double getVuelto() {
            return vuelto;
        }

        
        /**
         * Metodo que establece el vuelto del cliente.
         * @param vuelto Parametro que define el vuelto del cliente.
         */
        public void setVuelto(double vuelto) {
            this.vuelto = vuelto;
        }

        
        /**
         * Metodo que devuelve la canasta pedida en su forma de cadena. 
         * @return canastaPedida
         */
        public String getCanastaPedida() {
            return canastaPedida;
        }

        
        /**
         * Metodo que establece la canasta pedida en su forma de cadena. 
         * @param canastaPedida Parametro que define la canastaPedida en su forma de cadena.
         */
        public void setCanastaPedida(String canastaPedida) {
            this.canastaPedida = canastaPedida;
        }
        
        
        /**
         * Metodo que devuelve la fecha de compra en su forma de cadena. 
         * @return fechaComp
         */
        public String getFechaComp() {
            return fechaComp;
        }

        
        /**
         * Metodo que establece la fecha de compra en su forma de cadena.
         * @param fechaComp Parametro que define la fecha de compra en su forma de cadena.
         */
        public void setFechaComp(String fechaComp) {
            this.fechaComp = fechaComp;
        }

        
        /**
         * Metodo que devuelve el dni del cliente en su forma de cadena.
         * @return dnicliente
         */
        public String getDnicliente() {
            return dnicliente;
        }

        
        /**
         * Metodo que establece el dni del cliente en su forma de cadena.
         * @param dnicliente Parametro que define el dni del cliente.
         */
        public void setDnicliente(String dnicliente) {
            this.dnicliente = dnicliente;
        }

        
        /**
         * Metodo que devuelve el dni del jefe de negocio en su forma de cadena.
         * @return dnijefe.
         */
        public String getDnijefe() {
            return dnijefe;
        }

        
        /**
         * Metodo que establece el dni del jefe en su forma de cadena.
         * @param dnijefe Parametro que define el dni del jefe. 
         */
        public void setDnijefe(String dnijefe) {
            this.dnijefe = dnijefe;
        }

        
        /**
         * =====================================================
         */
        public void estIdComp(){
            String n;
        
            n = fechaFormat() + this.dnicliente;
            String idC = n.replace(" ","");
            String idComp = idC.replace(":","_");
            String idComp2 = idComp.replace("/","_");
        
            this.idComprobante = idComp2;
  
        }
    
    
        /**
         * Metodo que formatea la fecha con el formato de DIA dd/mm/yyyy HH:mm:ss
         * @return formato
         */
        public String fechaFormat(){

            SimpleDateFormat formatofecha = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss");
            String formato = formatofecha.format(fechaEmision);
        
            return formato;
        }
    
        
        /**
         * Metodo que calcula el valor total de la canasta de compra y le da el formato valido para monedas.
         * @param canasta Parametro que define un objeto de la clase Inventario.
         * @return total de la canasta de compra.
         */
        public double totalCanasta(Inventario canasta){
            double t = 0;
            
            for(int i = 0 ; i< canasta.getRegistroProductos().size(); i++){
                t = t + canasta.getRegistroProductos().get(i).getPrecioUnitProducto();
            }
        
            total = t;
            DecimalFormat dt = new DecimalFormat("#.##");
            total = Double.parseDouble(dt.format(total));
            return total;
        }
    
    
        /**
         * Metodo que calcula el vuelto que se le dara al cliente y le da el formato valido para monedas. 
         * @param canasta Parametro que define un objeto de la clase Inventario.
         * @return vuelto
         */
        public double vuelto(Inventario canasta){

            vuelto = efectivo - totalCanasta(canasta);
            DecimalFormat db = new DecimalFormat("#.##");
            vuelto = Double.parseDouble(db.format(vuelto));
            return vuelto;
        }

}
