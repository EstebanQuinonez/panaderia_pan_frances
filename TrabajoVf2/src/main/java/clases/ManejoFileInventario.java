package clases;
import java.io.*;

/**
 * Esta clase define objetos de tipo ManejoFileInventario
 * responsables de la escritura y lectura de los archivos respectivos.
 */
public class ManejoFileInventario {

        /**
        * Método en Java que utiliza el API de entrada y salida de Java 
        * (java.io) para leer un objeto de tipo Inventario desde un archivo
        * @param nombreArchivo Parametro que define el nombre del archivo que se desea leer
        * @param inv Parametro que define el objeto de tipo Inventario en el que se almacenará 
        * el contenido del archivo
        * @return El objeto de tipo Inventario que contiene los datos leídos del archivo
        */
        public static  Inventario leerInventarioDesdeArchivo(String nombreArchivo, Inventario inv) {

            try(FileInputStream fileIn = new FileInputStream(nombreArchivo);
                BufferedInputStream bis = new BufferedInputStream(fileIn);
                ObjectInputStream ois = new ObjectInputStream(bis);){

                inv = (Inventario) ois.readObject();

                ois.close();
                bis.close();
                fileIn.close();

            } catch (FileNotFoundException e) {

                // El archivo no existe o no se puede abrir

            } catch (IOException | ClassNotFoundException e) {
                // Error durante la lectura del archivo
                // No se encuentra la clase Inventario al leer el objeto
            }
            return inv;      
        }


        /**
        * Método que escribe un objeto de tipo Inventario en un archivo
        * @param nombreArchivo Parametro que define el nombreArchivo el nombre del archivo en el que se desea escribir
        * @param inv Parametro que define el inv el objeto de tipo Inventario que se desea escribir
        */      
        public static void escribirInventarioEnArchivo(String nombreArchivo, Inventario inv) {

            try(FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
                BufferedOutputStream bos = new BufferedOutputStream(fileOut);
                ObjectOutputStream out = new ObjectOutputStream(bos);){    
                

                out.writeObject(inv);

                out.close();
                bos.close();
                fileOut.close();

            }catch (FileNotFoundException e) {

             // El archivo no existe o no se puede abrir
            }catch (IOException e) {
             // Error durante la escritura del archivo          
            }
        }


        public  static ComprobanteC leerComprobanteDeArchivo(String nombreArchivo, ComprobanteC cmp2) {


            try( FileInputStream fileIn = new FileInputStream(nombreArchivo);
                BufferedInputStream bis = new BufferedInputStream(fileIn);
                ObjectInputStream ois = new ObjectInputStream(bis);) { 
               

                cmp2 = (ComprobanteC) ois.readObject();

                ois.close();
                bis.close();
                fileIn.close();

            } catch (FileNotFoundException e) {

                 // El archivo no existe o no se puede abrir
            } catch (IOException | ClassNotFoundException e) {
                 // Error durante la lectura del archivo
                 // No se encuentra la clase Inventario al leer el objeto
            }
            return cmp2;      
        }


        public  static void escribirComprobanteEnArchivo(String nombreArchivo, ComprobanteC cmp) {

            try ( FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
                BufferedOutputStream bos = new BufferedOutputStream(fileOut);
                ObjectOutputStream out = new ObjectOutputStream(bos);) {    
               

                out.writeObject(cmp);

                out.close();
                bos.close();
                fileOut.close();

            }catch (FileNotFoundException e) {

                 // El archivo no existe o no se puede abrir
            }catch (IOException e) {
                 // Error durante la escritura del archivo          
            }
        }


        public static void borrarContenidoArchivo(String nombreArchivo) throws IOException{
            try(FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
                ObjectOutputStream objOut = new ObjectOutputStream(fileOut);){
                
                objOut.reset(); // Borrar contenido del stream de objetos
                objOut.close();
                fileOut.close();
                // Eliminar el archivo del sistema de archivos
                File archivo = new File(nombreArchivo);
                archivo.delete();
            }catch(FileNotFoundException e){

            }  
        }
  
}

    
    
    
    
    
    
    
    
    
    
    
    
  

