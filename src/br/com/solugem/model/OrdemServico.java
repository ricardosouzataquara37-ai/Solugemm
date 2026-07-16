/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.solugem.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author principal
 */
public class OrdemServico {
    private int idOs;
    private String data;
    private double totalMaoObramaterial;
    private double desconto;
    private double totalMaoObraComDesc;
    private Cliente cliente;
    private Empresa empresa;
    private Endereco endereco;
    private ArrayList<FuncionarioServico> equipe;
    private ArrayList<MaterialUtilizado>listaMateriais;
    private ArrayList<ServicoConcluido>listaServicos;
    
    public OrdemServico(){
        this.listaMateriais = new ArrayList<>();
        this.listaServicos = new ArrayList<>();
        this.equipe = new ArrayList<>();
    }
    
    public void adicionarMaterial(MaterialUtilizado material){
        this.listaMateriais.add(material);
        //System.out.println("Material" + material.getMaterial().getNome() + " acicionado a lista Os");
    }
    
    public void adicionarServico(ServicoConcluido servico){
        this.listaServicos.add(servico);
        
    }
    
    public void adicionarEquipe(FuncionarioServico equipe){
        this.equipe.add(equipe);
    }

    public int getIdOs() {
        return idOs;
    }

    public void setIdOs(int idOs) {
        this.idOs = idOs;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotalMaoObramaterial() {
        return totalMaoObramaterial;
    }

    public void setTotalMaoObramaterial(double totalMaoObramaterial) {
        this.totalMaoObramaterial = totalMaoObramaterial;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotalMaoObraComDesc() {
        return totalMaoObraComDesc;
    }

    public void setTotalMaoObraComDesc(double totalMaoObraComDesc) {
        this.totalMaoObraComDesc = totalMaoObraComDesc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<FuncionarioServico> getEquipe() {
        return equipe;
    }

    public void setEquipe(ArrayList<FuncionarioServico> equipe) {
        this.equipe = equipe;
    }

    public ArrayList<MaterialUtilizado> getListaMateriais() {
        return listaMateriais;
    }

    public void setListaMateriais(ArrayList<MaterialUtilizado> listaMateriais) {
        this.listaMateriais = listaMateriais;
    }

    public ArrayList<ServicoConcluido> getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(ArrayList<ServicoConcluido> listaServicos) {
        this.listaServicos = listaServicos;
    }
    
    
    
    // ArrayList para testes simular banco de dados
    public double calcularTotalOs(){
        double soma = 0;
        for(MaterialUtilizado m :listaMateriais){
            soma +=m.getPrecoMaterial();
        }
        for(ServicoConcluido sc:listaServicos){
            soma +=sc.getPreco();
        }
        return soma;
    }
    
    
    
    
}
