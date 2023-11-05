/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NurtiX_BO;

/**
 *
 * @author ioutlet
 */
public class CaracteristicasAlimentares {
    
    
    int energiaKCAL;
    double carboHidratos;
    double acTotais; //Açucares totais
    double acAdicionados; //Acucares adicionados
    double proteinas;
    double gordurasTotais; //tambem conhecidas como lipidos
    double gordurasSat; //Saturadas
    double gordurasTransSat; //Trans saturadas
    double fibrasAlimentares; 
    double sal;
    
    
    public CaracteristicasAlimentares(){
        
    }
    
    ///SET
    public void DefineQuantidadeCalorias (int kcal)
    {
        energiaKCAL = kcal;
    }
    
    ///GET
    public int ObtemQuantidadeCalorias()
    {
        return energiaKCAL;
    }
    
    
    public void DefineCarboHidratos(double cHidrat)
    {
        this.carboHidratos = cHidrat;
    }
    
    public double ObtemQuantidadeCarboHidratos()
    {
        return carboHidratos;
    }
    
    public void DefineAcucaresTotais(double acTot)
    {
        this.acTotais = acTot;
    }
    public double ObtemAcucaresTotais()
    {
        return acTotais;
    }
            
    public void DefineAcucaresAdicionados(double acAdd)
    {
        this.acAdicionados = acAdd;
    }
    public double ObtemAcucaresAdicionados()
    {
        return acAdicionados;
    }
    
}
