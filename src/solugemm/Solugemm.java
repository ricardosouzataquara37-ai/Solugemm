/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solugemm;


import br.com.solugem.model.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import solugemmDao.ClienteDao;
import solugemmDao.FuncionarioDao;
import solugemmDao.MaterialDao;
import solugemmDao.TipoDeServicoDao;
import view.CadastroClientes;
import view.CadastroFuncionarios;
import view.CadastroMaterial;
import view.CadastroServicos;
import view.Login;
import view.TelaOrdemServico;

/**
 *
 * @author principal
 */
public class Solugemm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**-----------------------------------------------------
       Instruções ------------------------
       * Usuarios: 
       * Dono: login(matricula): 2004 senha: user2004
       * Atendente: login(matricula): 1003 senha: user1003
       * Material cadastrado pata teste de consulta: 1111 e 1112
       * Serviço cadastrado para teste de consulta: 1111 e 1112
       * Funcionários cadastrados para teste de consulta, busca por matricula: 0001,0002,1003 e 2004
       * Cliente cadastrado para teste de consulta, busca por CPF: 12345678900
       * -------------------------------------------------------
       *--------------------------------------------------------
       */
        
        
        
        
        // Cadastr de cliente e endereço
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        ClienteDao daoCli = new ClienteDao();
        Endereco endCliente1 = new Endereco();
        endCliente1.setRua("Rua das Flores");
        endCliente1.setNumero("10");
        endCliente1.setBairro("Freguesia");
        endCliente1.setCidade("Rio de Janeiro");
        endCliente1.setCep("22003039");
        endCliente1.setEstado("RJ");
        endCliente1.setCasa("6");
        
        Telefone telCliente1 = new Telefone();
        telCliente1.setNumero("21987765434");
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Antonio Nascimento");
        LocalDate dataNascimentoCliente = LocalDate.parse("10/10/2020", formato);
        cliente1.setDataNascimento(dataNascimentoCliente);
        cliente1.setEmail("Antonio123@hotmail.com");
        cliente1.setIdade(25);
        cliente1.setCPF("12345678900");
        cliente1.setSexo("M");
        cliente1.setEndereco(endCliente1);
        cliente1.setTelefone(telCliente1);
        daoCli.salvar(cliente1);
        
        
        // Materiais e fáfricante
        MaterialDao daoMat = new MaterialDao();
        Fabricante fab1 = new Fabricante();
        fab1.setNome("Brastemp");
        fab1.setIdFabricante(1);
        
        Material m1 = new Material();
        m1.setIdMaterial(1);
        m1.setCodigo("1111");
        m1.setNome("Capacitor de partida");
        m1.setPreco(60.00);
        m1.setFabricante(fab1);
        daoMat.salvar(m1);
        
        Material m2 = new Material();
        m2.setIdMaterial(2);
        m2.setCodigo("1112");
        m2.setNome("Compressor");
        m2.setPreco(200.00);
        m2.setFabricante(fab1);
        daoMat.salvar(m2);
        
        // criando uma lista de serviços
        TipoDeServico tipoServ1 = new TipoDeServico();
        TipoDeServicoDao daoTipoServ = new TipoDeServicoDao();
        tipoServ1.setIdTds(1);
        tipoServ1.setCodigo("1111");
        tipoServ1.setDescricao("Troca de capacitor Split 7000 a 12000");
        tipoServ1.setPrecoServico(140.00);
        daoTipoServ.salvar(tipoServ1);
        
        TipoDeServico tipoServ2 = new TipoDeServico();
        tipoServ2.setIdTds(2);
        tipoServ2.setCodigo("1112");
        tipoServ2.setDescricao("Carga de fluido refrigerante Ar 7000 a 12000");
        tipoServ2.setPrecoServico(240.00);
        daoTipoServ.salvar(tipoServ2);
        
        // Criando uma lista de funcionários
        // Funcionário 1
        FuncionarioDao daoFunc = new FuncionarioDao();
        Funcionario func1 = new Funcionario();
        Endereco endFunc1 = new Endereco();
        Cargo cargoFunc1 = new Cargo(4,"Mecânico  de refrigeração Split 1", 2.400);
        Empresa empresaFunc1 = new Empresa();
        Telefone telFunc1 = new Telefone();
        empresaFunc1.setIdEmpresa(1);
        
        
        endFunc1.setRua("Estrada dos mananceais");
        endFunc1.setNumero("10");
        endFunc1.setBairro("Cascadura");
        endFunc1.setCidade("Rio de Janeiro");
        endFunc1.setEstado("RJ");
        endFunc1.setCasa("2");
        
        telFunc1.setNumero("21995644455");
        
        func1.setIdFuncionario(1);
        func1.setNome("Francisco Xavier");
        func1.setMatricula("0001");
        func1.setIdentificacao("10128722622");
        LocalDate dataNascimentoFunc = LocalDate.parse("10/10/2000", formato);
        func1.setDataNascimento(dataNascimentoFunc);
        func1.setSexo("M");
        func1.setIdade(25);
        func1.setEmail("xavier123@gmail.com");
        func1.setSenha("user0001");
        func1.setEmpresa(empresaFunc1);
        func1.setCargo(cargoFunc1);
        func1.setEndereco(endFunc1);
        func1.setTelefome(telFunc1);
        daoFunc.salvar(func1);
        
        
// Funcionario 2 

        
        Funcionario func2 = new Funcionario();
        Endereco endFunc2 = new Endereco();
        Telefone telFunc2 = new Telefone();
        Cargo cargoFunc2 = new Cargo(5,"Mecânico de refrigeração Split 2", 2.800);
        Empresa empresaFunc2 = new Empresa();
        
        empresaFunc2.setIdEmpresa(1);
        
        
        endFunc2.setRua("Rua do Cajoeiro");
        endFunc2.setNumero("234");
        endFunc2.setBairro("Santa Cruz");
        endFunc2.setCidade("Rio de Janeiro");
        endFunc2.setEstado("RJ");
        endFunc2.setCasa("3");
        
        telFunc2.setNumero("21985645334");
        
        func2.setIdFuncionario(2);
        func2.setNome("Carlos da Silva");
        func2.setMatricula("0002");
        func2.setIdentificacao("25236347544");
        LocalDate dataNascimentoFunc2 = LocalDate.parse("05/08/2000", formato);
        func2.setDataNascimento(dataNascimentoFunc);
        func2.setSexo("M");
        func2.setIdade(25);
        func2.setEmail("brasil@gmail.com");
        func2.setSenha("user0002");
        func2.setEmpresa(empresaFunc2);
        func2.setCargo(cargoFunc2);
        func2.setEndereco(endFunc2);
        func2.setTelefome(telFunc2);
        daoFunc.salvar(func2);
        
        
                
// Funcionario 3 

        
        Funcionario func3 = new Funcionario();
        Endereco endFunc3 = new Endereco();
        Cargo cargoFunc3 = new Cargo(6,"Atendente", 2.200);
        Empresa empresaFunc3 = new Empresa();
        Telefone telFunc3 = new Telefone();
        empresaFunc3.setIdEmpresa(1);
        
        
        endFunc3.setRua("Rua do Carmo");
        endFunc3.setNumero("19");
        endFunc3.setBairro("Penha");
        endFunc3.setCidade("Rio de Janeiro");
        endFunc3.setEstado("RJ");
        endFunc3.setCasa("20");
        telFunc3.setNumero("21988775645");
        
        func3.setIdFuncionario(3);
        func3.setNome("Ana Maria da Siva");
        func3.setMatricula("1003");
        func3.setIdentificacao("28346576899");
        LocalDate dataNascimentoFunc3 = LocalDate.parse("01/03/2001", formato);
        func3.setDataNascimento(dataNascimentoFunc);
        func3.setSexo("F");
        func3.setIdade(26);
        func3.setEmail("Ana123@gmail.com");
        func3.setSenha("user1003");
        func3.setEmpresa(empresaFunc3);
        func3.setCargo(cargoFunc3);
        func3.setEndereco(endFunc3);
        func3.setTelefome(telFunc3);
        daoFunc.salvar(func3);
        
        
        // Funcionario 4 

        
        Funcionario func4 = new Funcionario();
        Endereco endFunc4 = new Endereco();
        Cargo cargoFunc4 = new Cargo(7,"Dono", 0.00);
        Empresa empresaFunc4 = new Empresa();
        
        empresaFunc4.setIdEmpresa(1);
        Telefone telFunc4 = new Telefone();
        
        endFunc4.setRua("Estrada do Tindiba");
        endFunc4.setNumero("2232");
        endFunc4.setBairro("Pechincha");
        endFunc4.setCidade("Rio de Janeiro");
        endFunc4.setEstado("RJ");
        endFunc4.setCasa("10");
        telFunc4.setNumero("21966778896");
        
        func4.setIdFuncionario(4);
        func4.setNome("José Antônio da Silva");
        func4.setMatricula("2004");
        func4.setIdentificacao("28354657688");
        LocalDate dataNascimentoFunc4 = LocalDate.parse("01/01/1975", formato);
        func4.setDataNascimento(dataNascimentoFunc);
        func4.setSexo("M");
        func4.setIdade(51);
        func4.setEmail("Antonio123@gmail.com");
        func4.setSenha("user2004");
        func4.setEmpresa(empresaFunc4);
        func4.setCargo(cargoFunc4);
        func4.setEndereco(endFunc4);
        func3.setTelefome(telFunc4);
        daoFunc.salvar(func4);
        
      
        
     //---------------------------------------------------------
     //---------------------------------------------------------
        
       // TelaOrdemServico os = new TelaOrdemServico();       
      //  os.setVisible(true);
       Login login = new Login();
       login.setVisible(true);
     // CadastroClientes cliente = new CadastroClientes();  
    //  cliente.setVisible(true);
    //  CadastroFuncionarios funcionario = new CadastroFuncionarios();
    //  funcionario.setVisible(true);
      //CadastroClientes cliente = new CadastroClientes();
     // cliente.setVisible(true);
   // CadastroMaterial mat = new CadastroMaterial();
  //  mat.setVisible(true);
   //CadastroServicos cad = new CadastroServicos();
  // cad.setVisible(true);
      
        
        
        
        
        
    }
}
        
        
        
        
    