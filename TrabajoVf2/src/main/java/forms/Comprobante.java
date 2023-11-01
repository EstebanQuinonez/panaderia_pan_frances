package forms;

import clases.Cliente;
import clases.ComprobanteC;
import clases.Inventario;
import clases.Jefe;
import clases.ManejoFileInventario;
import clases.Persona;
import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Comprobante extends javax.swing.JFrame {

    /**
     * Creates new form Comprobante
     */

    Inventario canastaPedida ;
    public Comprobante() {
        initComponents();
        setResizable(false);
        setTitle("GENERANDO COMPROBANTE");
       
        btnCalcular.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnImprimir.setEnabled(false);
        txtCanasta.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCanasta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalCobro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJefe = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        btnBuscarPedido = new javax.swing.JButton();
        ruta = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        TituloComprobante = new javax.swing.JLabel();
        btnCerrarVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCanasta.setEditable(false);
        txtCanasta.setColumns(20);
        txtCanasta.setRows(5);
        jScrollPane1.setViewportView(txtCanasta);

        jLabel1.setText("FECHA: ");

        jLabel2.setText("TOTAL A PAGAR:");

        txtTotalCobro.setEditable(false);

        jLabel3.setText("EFECTIVO");

        jLabel4.setText("VUELTO: ");

        txtVuelto.setEditable(false);

        jLabel5.setText("VENDEDOR: ");

        jLabel6.setText("CLIENTE:");

        txtJefe.setEditable(false);
        txtJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJefeActionPerformed(evt);
            }
        });

        txtCliente.setEditable(false);

        btnBuscarPedido.setIcon(new javax.swing.ImageIcon("src/main/java/recursos/buscarpedido.png"));
        btnBuscarPedido.setText("BUSCAR PEDIDO");
        btnBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPedidoActionPerformed(evt);
            }
        });

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon("src/main/java/recursos/save.png"));
        btnGuardar.setText("GUARDAR RECIBO");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon("src/main/java/recursos/ventas.png"));
        btnImprimir.setText("IMPRIMIR RECIBO");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon("src/main/java/recursos/borrar-escrito.png"));
        btnCancelar.setText("CANCELAR PAGO ");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        TituloComprobante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TituloComprobante.setText("NEGOCIO PRODUCTOS S.A");

        btnCerrarVentana.setIcon(new javax.swing.ImageIcon("src/main/java/recursos/exit.png"));
        btnCerrarVentana.setText("CERRAR VENTANA");
        btnCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVentanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(btnBuscarPedido)
                            .addGap(357, 357, 357)
                            .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TituloComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(53, 53, 53))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTotalCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVuelto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCalcular))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCerrarVentana)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnImprimir)))
                                .addGap(36, 36, 36)
                                .addComponent(btnCancelar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(TituloComprobante)
                .addGap(12, 12, 12)
                .addComponent(btnBuscarPedido)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ruta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnImprimir)
                            .addComponent(btnCancelar))
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarVentana)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPedidoActionPerformed
        // TODO add your handling code here:
        /**
        * Este método muestra un JFileChooser para seleccionar un archivo de inventario,
        * y luego lee los datos del archivo seleccionado en un objeto Inventario para mostrar la lista de productos en el cuadro de texto correspondiente
        * Crea un objeto ComprobanteC y establece los valores para la fecha, el total de cobro y los campos de texto correspondientes.
        */
        String nombreArchivoGuardado = "";
        // Crea un objeto de JFileChooser y establece la carpeta actual como la carpeta de trabajo del usuario.
        JFileChooser fileChooser = new JFileChooser();
        String currentDir = System.getProperty("user.dir");
        
        fileChooser.setCurrentDirectory(new File(currentDir));
        int result = fileChooser.showOpenDialog(this);
        // Si se selecciona un archivo
        if (result == JFileChooser.APPROVE_OPTION){  
            File selectedFile = fileChooser.getSelectedFile(); 
            File archivoGuardado = new File(selectedFile.getAbsolutePath());
            nombreArchivoGuardado = archivoGuardado.getName();
             
            canastaPedida = new Inventario(nombreArchivoGuardado);
            // Lee los datos del archivo seleccionado en un objeto Inventario
            canastaPedida = ManejoFileInventario.leerInventarioDesdeArchivo(nombreArchivoGuardado, canastaPedida);
            txtCanasta.setText(canastaPedida.getRegistroProductos().toString());
            System.out.println("lectura exitosa");
        }
        
        // Establece los valores para la fecha, el total de cobro y los campos de texto correspondientes
        // como dni del cliente, dni del jefe de negocio, total a pagar
        txtEfectivo.setText("0");
        double efectivo = Double.parseDouble(txtEfectivo.getText());
        Persona c = new Cliente(nombreArchivoGuardado);
        Persona j = new Jefe();
        
        
        ComprobanteC comp = new ComprobanteC(nombreArchivoGuardado,efectivo);
        
        txtFecha.setText(comp.fechaFormat());
        
        double totalcobro = comp.totalCanasta(canastaPedida);
        String totals =   String.valueOf(totalcobro);
        
        txtTotalCobro.setText(totals);
        txtCliente.setText(c.getDni());
        txtJefe.setText(j.getDni());
        btnCalcular.setEnabled(true);
        txtEfectivo.setEditable(true);
        txtJefe.setEditable(true);
  
    }//GEN-LAST:event_btnBuscarPedidoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        /**
         * Este metodo toma la entrada del usuario de un campo de texto,
         * la verifica para asegurarse de que sea un número válido, 
         * calcula el cambio a devolver si el usuario paga con efectivo 
         * y muestra mensajes de error apropiados si la entrada no es
         * válida o el efectivo pagado es insuficiente 
         * Este código también actualiza la interfaz de usuario
         * para reflejar los cambios en el estado de la transacción.
         */
        
        
        /*
        Esta línea utiliza una expresión regular para verificar 
        si el texto ingresado en el campo "txtEfectivo" corresponde
        a un número con dos decimales (por ejemplo, "10.00" o "25.50"). 
        La variable "esNumero" se establece en "true" si la entrada del
         usuario coincide con este patrón y en "false" de lo contrario.
        */
        boolean esNumero = txtEfectivo.getText().matches("^\\d+(\\.\\d{2})?$");
        
        
        if(esNumero){
         /*Si la entrada del usuario es un número válido, se crea una variable "efectivo" de tipo "double" 
         y se establece su valor como el valor numérico de la entrada de texto del campo "txtEfectivo".*/
            double efectivo;
            efectivo = Double.parseDouble(txtEfectivo.getText());
            
            /*
            Se verifica si la cantidad de efectivo ingresada por el usuario 
            es mayor o igual al total que se debe cobrar (obtenido del campo "txtTotalCobro").
            */  
            if(efectivo >= Double.parseDouble(txtTotalCobro.getText())){

                /*
                Se crea un nuevo objeto "ComprobanteC" y se llama a su método
                "vuelto" para calcular el cambio a devolver.
                El valor devuelto se muestra en el campo de texto "txtVuelto" 
                y se deshabilita el botón "btnGuardar" mientras se habilita el botón "btnImprimir". 
                */
                ComprobanteC comp = new ComprobanteC(txtCliente.getText(),efectivo);
             
                String vueltoS = String.valueOf(comp.vuelto(canastaPedida));
                txtVuelto.setText(vueltoS);
        
                btnGuardar.setEnabled(false);
                btnImprimir.setEnabled(true);
                txtEfectivo.setEditable(false);
                btnCalcular.setEnabled(false);
                btnBuscarPedido.setEnabled(false);
            }else{
                //Si la cantidad de efectivo es menor que el total a cobrar, se muestra un mensaje de error.
                   JOptionPane.showMessageDialog(null, "Ingrese un monto valido." , "Efectivo", JOptionPane.INFORMATION_MESSAGE);
            }
                    
        }else{
            //Si la cantidad de efectivo es menor que el total a cobrar, se muestra un mensaje de error.
                   JOptionPane.showMessageDialog(null, "Ingrese un monto valido.", "Efectivo", JOptionPane.INFORMATION_MESSAGE);  
        }
           
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        /**
         * Este metodo genera un ID único para un comprobante de venta, crea un objeto "ComprobanteC" que representa
         * la venta, lo escribe en un archivo, borra el contenido del archivo de texto que contiene 
         * información sobre el pedido del cliente y actualiza la interfaz.
         */
        /*
        Estas líneas crean una cadena de texto "id" concatenando los valores de los campos "txtCliente" y "txtFecha".
        Luego, se eliminan los espacios en blanco y se reemplazan los dos puntos (":") y las barras diagonales ("/") 
        por guiones bajos ("_") para crear un ID único para el comprobante. El ID resultante se almacena en la variable "idComp2".
        */
        String id= txtCliente.getText()+txtFecha.getText();
        String idC = id.replace(" ","");
        String idComp = idC.replace(":","_");
        String idComp2 = idComp.replace("/","_");

        
        /*
        Estas líneas extraen los valores numéricos de los campos
        "txtTotalCobro", "txtVuelto" y "txtEfectivo" y los almacenan 
        en las variables "totalV", "vuelto" y "efectivo", respectivamente.
        */
        double totalV = Double.parseDouble(txtTotalCobro.getText());
        // Se crea un objeto DecimalFormat con un patrón de formato de dos decimales
        DecimalFormat dt = new DecimalFormat("#.##");
        // Se formatea el valor de la variable totalV con dos decimales usando el objeto DecimalFormat
         totalV = Double.parseDouble(dt.format(totalV));
         
          
        double vuelto = Double.parseDouble(txtVuelto.getText());
        // Se crea un objeto DecimalFormat con un patrón de formato de dos decimales
        DecimalFormat dv = new DecimalFormat("#.##");
        // Se formatea el valor de la variable vuelto con dos decimales usando el objeto DecimalFormat
        vuelto = Double.parseDouble(dv.format(vuelto));
        double efectivo = Double.parseDouble( txtEfectivo.getText());
    
        //Esta línea imprime el ID generado en la consola para fines de depuración.
        System.out.println(idComp2);
        
        /*
        Esta línea crea un objeto "ComprobanteC" que representa la venta realizada. Se le proporcionan los valores 
        de los campos "txtCliente", "txtJefe", "txtFecha", "txtCanasta", "idC", "totalV", "efectivo" y "vuelto".
        */
        ComprobanteC com2 = new ComprobanteC( txtCliente.getText() , txtJefe.getText(), txtFecha.getText(),  txtCanasta.getText(),idC,totalV,efectivo,vuelto);
       
        /*
        Esta línea llama a un método "escribirComprobanteEnArchivo"  de la clase ManejoFileInventario para escribir el objeto 
        "ComprobanteC" en un archivo utilizando el ID generado como el nombre del archivo.
        */
        ManejoFileInventario.escribirComprobanteEnArchivo(idComp2, com2);
        
        /*
        Estas líneas llama a un método "borrarContenidoArchivo" de la clase ManejoFileInventario para borrar el contenido de un archivo que contiene información 
        sobre el pedido del cliente. Se maneja la excepción de E/S que pueda surgir en la operación mostrando un mensaje.
        */
        try {
            ManejoFileInventario.borrarContenidoArchivo(txtCliente.getText());
        } catch (IOException io) {
            System.out.println("A  OCURRIDO UN ERROR AL BORRAR EL PEDIDO DE ID : "  + txtCliente.getText());
        }
        
        btnGuardar.setEnabled(false);
        txtCanasta.setText("");
        txtCliente.setText("");
        txtEfectivo.setText("");
        txtFecha.setText("");
        txtJefe.setText("");
        txtTotalCobro.setText("");
        txtVuelto.setText("");
        txtEfectivo.setEditable(false);
        btnGuardar.setEnabled(false);
        btnCalcular.setEnabled(false);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        btnCalcular.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnImprimir.setEnabled(false);
        txtCanasta.setEditable(false);
        txtCanasta.setText("");
        txtCliente.setText("");
        txtJefe.setText("");
        txtEfectivo.setText("");
        txtVuelto.setText("");
        txtFecha.setText("");
        txtTotalCobro.setText("");
        btnBuscarPedido.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJefeActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        /**
        * Muestra un mensaje con la información del pedido completo y activa el botón de guardar para generar el archivo del comprobante del pedido.
        */
        
        /*Se obtiene el valor ingresado por el usuario en un campo de texto llamado
        "txtJefe" y se almacena en una variable llamada "dniJefe".*/
        String dniJefe = txtJefe.getText(); /*Se verifica si la cadena almacenada en "dniJefe" contiene solo números
        y si tiene una longitud de 8 caracteres. El resultado de esta verificación se almacena en la variable booleana "contieneSoloNumerosI".*/
        boolean contieneSoloNumerosI = dniJefe.matches("^[0-9]{8}$");
        
        
        if(contieneSoloNumerosI){
            txtJefe.setEditable(false);
            String mensaje = 
                "NEGOCIO PRODUCTOS S.A\n\nDATOS DEL PEDIDO:\n" + txtCanasta.getText()+ "\n\nFECHA: " + txtFecha.getText()
                 + "\n\nTOTAL A PAGAR: " + txtTotalCobro.getText() + "\n\nEFECTIVO: " + txtEfectivo.getText()+"\n\nVUELTO: "+ txtVuelto.getText() 
                + "\n\nJEFE: " + txtJefe.getText()+"\n\nCLIENTE: " + txtCliente.getText()+ "\n\n\t\tGRACIAS POR SU COMPRA";
            // Muestra un cuadro de diálogo con el mensaje de información de pago
            JOptionPane.showMessageDialog(null, mensaje, "INFORMACION DE PAGO", JOptionPane.INFORMATION_MESSAGE);
            // Imprime el mensaje en la consola    
            System.out.println(mensaje);
            // Activa el botón de guardar
            btnGuardar.setEnabled(true);
        
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese DNI valido" , "DNI", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVentanaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarVentanaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Comprobante().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloComprobante;
    private javax.swing.JButton btnBuscarPedido;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrarVentana;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ruta;
    private javax.swing.JTextArea txtCanasta;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JTextField txtJefe;
    private javax.swing.JTextField txtTotalCobro;
    private javax.swing.JTextField txtVuelto;
    // End of variables declaration//GEN-END:variables
}