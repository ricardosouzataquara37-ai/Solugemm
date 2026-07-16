/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solugemmDao;

import br.com.solugem.model.OrdemServico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author principal
 */
public class OrdemServicoDao {
    
     private static List<OrdemServico> listaOs = new ArrayList<>();  
     
     public void salvar(OrdemServico os){
         listaOs.add(os);
     }
     
     
     public OrdemServico cliente(String CPF){
         OrdemServico os = null;
         for(OrdemServico osv : listaOs){
             if(osv.getCliente().getCPF().equals(CPF)){
                
                 return osv;
             }
         }
         return null;
     }
     
     public boolean salvarOs(OrdemServico os){
         
         boolean inserido = listaOs.add(os);
        
         return inserido;
     }
     
    
    
    
    
    
}
