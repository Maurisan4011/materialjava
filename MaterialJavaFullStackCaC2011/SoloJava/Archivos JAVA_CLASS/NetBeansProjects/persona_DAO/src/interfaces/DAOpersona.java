
package interfaces;

import consultageneraljdbc.Persona;
import java.util.ArrayList;


public interface DAOpersona {
    
    public void registrar(Persona per)throws Exception;
    public void modificar(Persona per)throws Exception;
    public void eliminar(Persona per)throws Exception;
    public ArrayList<Object[]>listar()throws Exception;//Persona //Object[]
}
