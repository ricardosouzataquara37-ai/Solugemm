/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solugemmDao;

import br.com.solugem.model.Cliente;
import br.com.solugem.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author principal
 */
public class ClienteDao {
    
    
      private static List<Cliente> listaCliente = new ArrayList<>();  
     
     public void salvar(Cliente cliente){
         listaCliente.add(cliente);
     }
     
     public List<Cliente> consultarTodos(){
         
         return new ArrayList<>(listaCliente);
     }
     
     public Cliente cliente(String CPF){
         Cliente cliente = null;
         for(Cliente c : listaCliente){
             if(c.getCPF().equals(CPF)){
                
                 return c;
             }
         }
         return null;
     }
     
     // Update 
    public void atualizar(Cliente clienteAtualizado) {
   
    for (int i = 0; i < listaCliente.size(); i++) {
        Cliente c = listaCliente.get(i);
        
        
        if (c.getCPF().equals(clienteAtualizado.getCPF())) {
            
            listaCliente.set(i, clienteAtualizado);
            System.out.println("Cliente atualizado na lista com sucesso!");
            return; 
        }
    }
   // System.out.println("Cliente com CPF " + clienteAtualizado.getCpf() + " não encontrado.");
}
    
 public  void remover(int indice){
        if(indice >= 0 && indice < listaCliente.size()){
            this.listaCliente.remove(indice);
        }
 }     






//------------------------------------------------------------
    
}
