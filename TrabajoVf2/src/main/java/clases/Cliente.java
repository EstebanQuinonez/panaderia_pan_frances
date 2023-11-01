package clases;
/**
 * Esta clase denominada Cliente modela un cliente con el
 * atributo dni heredado
 */
public class Cliente extends Persona {

    /**
     * Contructor con un parametro dni heredado
     * @param dni 
     */
    public Cliente(String dni) {
        super(dni);
    }
    
    
     /**
     * Constructor sin parametros de la clase Cliente
     */
    public Cliente(){ 
    }
    
}
