/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solugemmDao;

import br.com.solugem.model.Cargo;
import br.com.solugem.model.Empresa;
import br.com.solugem.model.Endereco;
import br.com.solugem.model.Funcionario;
import br.com.solugem.model.Telefone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author principal
 */
public class FuncionarioDao {
    
     private static List <Funcionario> listaFuncionarios = new ArrayList<>();
    
    public void salvar(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }
    
    public List<Funcionario> consultarTodos() {
    return listaFuncionarios.stream()
            
            .collect(Collectors.toList());
   }
    
    
    public Funcionario consultar(String matricula) {
        for(Funcionario f: listaFuncionarios){
            if(f.getMatricula().equals(matricula)){
                return f;
            }
        }
            
        return null;
    } 
    
     public Funcionario consultarUsuario(String matricula, String senha) {
        for(Funcionario f: listaFuncionarios){
            if(f.getMatricula().equals(matricula) && f.getSenha().equals(senha)){
                return f;
            }
        }
            
        return null;
    }
     
      // Update 
    public void atualizar(Funcionario funcionarioAtualizado) {
   
    for (int i = 0; i < listaFuncionarios.size(); i++) {
        Funcionario f = listaFuncionarios.get(i);
        
        
        if (f.getIdentificacao().equals(funcionarioAtualizado.getIdentificacao())) {
            
            listaFuncionarios.set(i, funcionarioAtualizado);
            System.out.println("Funcionário atualizado na lista com sucesso!");
            return; 
        }
    }
   // System.out.println("Cliente com CPF " + clienteAtualizado.getCpf() + " não encontrado.");
}
    
 public  void remover(int indice){
        if(indice >= 0 && indice < listaFuncionarios.size()){
            this.listaFuncionarios.remove(indice);
        }
 }     
  
    
    
    
    
    
 // -----------------------------------------------------------------   
 
    
    
}
