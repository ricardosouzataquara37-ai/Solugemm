/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solugemmDao;

import br.com.solugem.model.Material;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author principal
 */
public class MaterialDao {
    
    private static List <Material> listaMaterial = new ArrayList<>();
    
    public void salvar(Material material){
        listaMaterial.add(material);
    }
    
    public List<Material> consultarTodos() {
    return listaMaterial.stream()
            // Filtra os itens onde o código do material é igual ao parâmetro
           // .filter(m -> Objects.equals(m.getCodigo(), codigo))
            // Coleta o resultado em uma nova lista
            .collect(Collectors.toList());
   }
    public List<Material> consultarTodos(String codigo) {
    return listaMaterial.stream()
            // Filtra os itens onde o código do material é igual ao parâmetro
            .filter(m -> Objects.equals(m.getCodigo(), codigo))
            // Coleta o resultado em uma nova lista
            .collect(Collectors.toList());
   } 
    
    public Material consultar(String codigo) {
        for(Material m: listaMaterial){
            if(m.getCodigo().equals(codigo)){
                return m;
            }
        }
            
        return null;
    } 
    
  public void atualizar(Material materialAtualizado) {
   
    for (int i = 0; i < listaMaterial.size(); i++) {
        Material m = listaMaterial.get(i);
        
        
        if (m.getCodigo().equals(materialAtualizado.getCodigo())) {
            
            listaMaterial.set(i, materialAtualizado);
            System.out.println("Material atualizado na lista com sucesso!");
            return; 
        }
    }
  
}
 
     public  void remover(int indice){
        if(indice >= 0 && indice < listaMaterial.size()){
            this.listaMaterial.remove(indice);
        }  
     }        
     
    
}
