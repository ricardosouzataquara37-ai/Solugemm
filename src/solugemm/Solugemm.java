/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solugemm;


import br.com.solugem.model.*;
import java.util.ArrayList;

/**
 *
 * @author principal
 */
public class Solugemm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cadastr de cliente e endereço
        Endereco endCliente = new Endereco();
        endCliente.setRua("Rua das Flores");
        endCliente.setNumero(10);
        endCliente.setBairro("Taquara");
        endCliente.setCidade("Rio de Janeiro");
        endCliente.setEstado("RJ");
        endCliente.setCasa("10");
        
        Cliente cliente = new Cliente();
        cliente.setNome("Antonio Nascimento");
        cliente.setDataNascimento("20/10/2000");
        cliente.setEmail("Antonio123@hotmail.com");
        cliente.setIdade(25);
        cliente.setIdentificacao("102.202.202-22");
        cliente.setSexo("M");
        cliente.setEndereco(endCliente);
        
        // Materiais e fáfricante
        Fabricante fab = new Fabricante();
        fab.setNome("Brastemp");
        
        Material m1 = new Material();
        m1.setNome("Capacitor de partida");
        m1.setPreco(60.00);
        m1.setFabricante(fab);
        
        Material m2 = new Material();
        m2.setNome("Compressor");
        m2.setPreco(200.00);
        m2.setFabricante(fab);
         
         // Criando uma Os
         OrdemServico os = new OrdemServico();
        
        // Itens da Os
        MaterialUtilizado matUtilizado1 = new MaterialUtilizado();
        matUtilizado1.setMaterial(m1);
        matUtilizado1.setQtdMaterial(1);
        matUtilizado1.setPrecoMaterial(60.00);
        matUtilizado1.setTotalMaterialUtilizado(60.00);
         // Adicionar os itens a lista
        os.adicionarMaterial(matUtilizado1);
         
        MaterialUtilizado matUtilizado2 = new MaterialUtilizado();
        matUtilizado2.setMaterial(m2);
        matUtilizado2.setQtdMaterial(1);
        matUtilizado2.setPrecoMaterial(200.00);
        matUtilizado2.setTotalMaterialUtilizado(200.00);
         // Adicionar os itens a lista
        os.adicionarMaterial(matUtilizado2);
        
         
        // Definição da mão de obra
        TipoDeServico tipo = new TipoDeServico();
        tipo.setDescricao("Troca de capacitor");
        tipo.setPrecoServico(150.00);
        
        // definição dos tipos de serviços que foram execurados na Os
        ServicoConcluido servConcluido = new ServicoConcluido();
        servConcluido.setTipoServico(tipo);
        servConcluido.setQtdTipoServico(1);
        servConcluido.setPreco(150.00);
        servConcluido.setTotalMaoObra(150.00);
         // Adicionar os itens a lista
        os.adicionarServico(servConcluido);
        
        // Definição dos funcionários
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Joao Nascimento");
        funcionario.setMatricula("2023");
        
        // Definição da equipe técnica que executaram os serviços na Os
        FuncionarioServico registroTrabalho = new FuncionarioServico();
        registroTrabalho.setFuncionario(funcionario);
        registroTrabalho.setHoraInicioServico("09:00");
        registroTrabalho.setHoraFimServico("11:30");
        registroTrabalho.setObservacaoFuncionario("Servico realizado com sucesso");
         // Adicionar os itens a lista
        os.adicionarEquipe(registroTrabalho);
        // Geração da ordem de serviço
       
       
       
        /** O valor passado como parametro é apenas uma demonstração
         * pois o banco de dados está programado para fazer todos os cálculos e lançar
         * através de triggeres, procedures e functions. Os dados são calculados e lançados 
         * nas colunas totalMaoObramateria,desconto e totalMaoObraComDesc.
         */
        // Calcular o total da mão de obra com o total dos materiais utilizados para executar os serviços
        os.setTotalMaoObramaterial(os.calcularTotalOs());
       
       // os.adicionarMaterial(matUtilizado);
        os.setCliente(cliente);
        os.setEndereco(endCliente);
        os.setData("20/04/2026");
        
        
        // Exibir a Ordem de serviços no console
        exibirRelatorioOS(os);
        
        
        
        
    }
    
    public static void exibirRelatorioOS(OrdemServico os){
        System.out.println("========================= ORDEM DE SERVICOS SOLUGEMM");
        System.out.println("Cliente: " + os.getCliente().getNome());
        System.out.println("Endereco: " + os.getEndereco().getRua());
        System.out.println("Data da Os: " + os.getData());
        System.out.println("-------------------------");
        
        System.out.println("Materiais:");
        for(MaterialUtilizado m: os.getListaMateriais()){
            System.out.println(m.getMaterial().getNome() + "(QTD  " + m.getQtdMaterial() + "  Valor R$: " + m.getTotalMaterialUtilizado() + ")");
        }
        System.out.println("Servicos:");
        for(ServicoConcluido sc: os.getListaServicos()){
            System.out.println("-" + " Descricao: " + sc.getTipoServico().getDescricao() +
                    "(  QTD  " + sc.getQtdTipoServico() + "  Valor R$: " + sc.getTotalMaoObra() + ")");
            
        }
        
        System.out.println("EQUIPE TECNICA: ");
        for(FuncionarioServico fs: os.getEquipe()){
            System.out.println("-" + fs.getFuncionario().getNome() + "| Obs: "
                    + fs.getObservacaoFuncionario());
        }
        
        System.out.println("-------------------------");
        System.out.println("TOTAL GERAL: R$"  + os.getTotalMaoObramaterial());
        System.out.println("=========================");
        
    }
    
}
