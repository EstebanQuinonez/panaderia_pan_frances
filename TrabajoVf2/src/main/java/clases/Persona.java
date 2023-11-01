package clases;
/**
 * Esta clase denominada Persona modela una persona  con su dni
 */
public class Persona {
    
    
        String dni ; /*Atributo que define el dni de una persona.*/


        /**
         * Constructor sin parametros.
         */
        public Persona(){

        }


        /**
         * Constructor con un unico parametro.
         * @param dni Parametro que define el dni de una persona.
         */
        public Persona(String dni) {
            this.dni = dni;

        }


        /**
         * Meotodo que devuelve el dni de una persona.
         * @return dni.
         */
        public String getDni() {
            return dni;
        }


        /**
         * Metodo que establece el dni de una persona.
         * @param dni Parametro que define el dni de una persona.
         */
        public void setDni(String dni) {
            this.dni = dni;
        }

}
