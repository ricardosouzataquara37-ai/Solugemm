/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solugemmDao;

import br.com.solugem.model.TipoDeServico;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class TipoDeServicoDao {
    private static List<TipoDeServico> tds = new ArrayList<>();
    
    public void  salvar(TipoDeServico tipoServ){
        tds.add(tipoServ);
    }
    
    //Aborrdagem moderna(Java 8)
    public List<TipoDeServico> consultarTodos(String codigo) {
    return tds.stream()
            // Filtra os itens onde o código do material é igual ao parâmetro
            .filter(m -> Objects.equals(m.getCodigo(), codigo))
            // Coleta o resultado em uma nova lista
            .collect(Collectors.toList());
     }
    public List<TipoDeServico> consultarTodos() {
    return tds.stream()
            
            .collect(Collectors.toList());
     }
    
     public  void remover(int indice){
        if(indice >= 0 && indice < tds.size()){
            this.tds.remove(indice);
     }
 }   
  
 public TipoDeServico consultar(String codigo) {
        for(TipoDeServico ts: tds){
            if(ts.getCodigo().equals(codigo)){
                return ts;
            }
        }
            
        return null;
    } 
 
 
  
  public void atualizar(TipoDeServico tipoServicoAtualizado) {
   
    for (int i = 0; i < tds.size(); i++) {
        TipoDeServico tdserv = tds.get(i);
        
        
        if (tdserv.getCodigo().equals(tipoServicoAtualizado.getCodigo())) {
            
            tds.set(i, tipoServicoAtualizado);
            System.out.println("Servico atualizado na lista com sucesso!");
            return; 
        }
    }
  
}
 
 
 
 



}

