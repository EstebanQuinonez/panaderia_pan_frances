package clases;

import java.util.Scanner;

/**
 * Esta clase define objetos de tipo Jefe con un
 * login a modo de identificador del usuario y contraseña
 */
public class Jefe  extends Persona{
      
        private  String login; /*Atributo que define el login de usuario del jefe de negocio*/
        private String contraseña; /*Atributo que define la contraseña del jefe de negocio*/


        /**
         * Constructor con parametros de la clase Jefe.
         * @param dni Parametro que define el dni del jefe de negocio.
         * @param login Parametro que define el login del jefe de negocio.
         * @param contraseña Parametro que define la contraseña del jefe de negocio.
         */
        public Jefe(String dni, String login,String contraseña){
            super(dni);
            this.dni=dni;
            this.contraseña = contraseña;   
        }


        /**
        * Constructor sin parametros de la clase Jefe
        */
        public Jefe() {
            
            login = "Esteban";
             contraseña = "123";      
        }


        /**
         * Contructor de la clase Jefe con 1 solo parametro.
         * @param dni Parametro que define el dni del jefe de negocio.
         */
        public Jefe(String dni){
            super(dni);
             login = "SINVALOR";
             contraseña = "SINVALOR"; 
        }
        
        /**
         * Constructor de la clase Jefe con 2 parametros.
         * @param usuario Parametro que define el usuario del usuario jefe.
         * @param contraseña  Parametro que define la contraseña del usuario jefe.
         */
        public Jefe(String usuario, String contraseña){
           
            this.login = usuario;
            this.contraseña = contraseña;
        }

        
        /**
         * Metodo que devuelve el login del usuario jefe.
         * @return login.
         */
        public String getLogin() {
            return login;
        }

        
        /**
         * Metodo que establece el login del  jefe de negocio.
         * @param login Parametro que define el login del jefe de negocio.
         */
        public void setLogin(String login) {
            this.login = login;
        }

        
        /**
         * Metodo que devuelve la contraseña del jefe de negocio.
         * @return contraseña.
         */
        public String getContraseña() {
            return contraseña;
        }

        
        /**
         * Metodo que establece la contraseña del jefe de negocio.
         * @param contraseña Parametro que define la contraseña del jefe de negocio.
         */
        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        
        
        
        

        /**
        * Método devuelve un booleano si las credenciales del usuario EN CONSOLA
        * son iguales que los valores prestablecidos en el constructor sin parametros
        * @return un valor boleano que determina la corcondancia de las credenciales.
        */
        public boolean logeoJefeConsol() {

            Scanner sc = new Scanner(System.in);
            String id, contra;
            System.out.print("INGRESE SU ID LOGIN : ");
            id = sc.nextLine();
            System.out.print("INGRESE SU CONTRASEÑA : ");
            contra = sc.nextLine();

            return logeoJefe(id,contra);     
        }


        /**
         * Método que retorna un booleano si el logeo con las credenciales ingresadas
         * es correcto EN GUI 
         * @param idIngresado Parametro que define un idIngresado
         * @param contraIngresada Parametro que define una contraseñaIngresada
         * @return un valor boleano que determina la corcondancia de las credenciales
         */
        public boolean logeoJefe(String idIngresado, String contraIngresada){

            return this.login.equals(idIngresado) && this.contraseña.equals(contraIngresada);
        }
    
}
