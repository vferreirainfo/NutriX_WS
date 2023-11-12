/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NurtiX_BO;

/**
 *
 * @author ioutlet
 */
public class CaractisticasLiquidos {
    
    
    double resSeco;
    int tolResSeco;
    double ph;
    double bicarbonato;
    double calcio;
    double cloreto;
    double nitr; //nitrato
    
    
    
    public CaractisticasLiquidos(){
        
    }
    
    
    public void DefResiduoSeco(double rSeco)
    {
        this.resSeco = rSeco;
    }
    public double ObterResiduoSeco()
    {
        return resSeco;
    }
    
    public void DefToleranciaResiduoSeco(int tResSeco)
    {
        this.tolResSeco = tResSeco;
    }
    
    public int ObtToleranciaResiduoSeco()
    {
        return tolResSeco;
    }
    
    public void DefPH(double ph)
    {
        //ph=ph;
        this.ph=ph;
    }
    public double ObtPH()
    {
        return ph;
    }
    
    public void DefBiCarbonato(double bcarb)
    {
        bicarbonato = bcarb;
    }
    
    
    public void DefCalcio(double cal)
    {
        calcio = cal;
    }
    
    public double ObtCalcio()
    {
        return calcio;
    }
    
    public void DefCloreto (double cl)
    {
        cloreto = cl;
    }
    
   public double ObtCloreto()
   {
       return cloreto;
   }
   
   public void DefNitrato(double nt)
   {
       nitr = nt;
   }
   
}
