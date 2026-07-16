/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solugemmDao;

import br.com.solugem.model.Cargo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author principal
 */
public class CargoDao {
    
    private static List<Cargo> listaCargo = new ArrayList<>();
    
    
    static {
        listaCargo.add(new Cargo(1,"Proprietátio",00));
        listaCargo.add(new Cargo(2,"Técnico 2",3200));
        listaCargo.add(new Cargo(3,"Técnico 1",2400));
    }
    
    public List<Cargo> listarTodos() {
        return listaCargo;
    }
    
    // método auxiliar
    private static List<Cargo> listarCargoMain = new ArrayList<>();  
     
     public void salvar(Cargo cargo){
         listarCargoMain.add(cargo);
     }
    
    
}
