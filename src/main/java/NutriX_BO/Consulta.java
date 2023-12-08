/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NutriX_BO;

import java.util.Date;

/**
 *
 * @author ioutlet
 */
public class Consulta {
    
    
    Date dataConsulta;
    HPS histSocialPessoa; //?? 
    //Pensar se faz sentido ter este objeto aqui ou em anamnese
    DiarioAlimentar drAlim; //??
    
    
    //
    public Consulta(){
        
    }
    
    public void DefData(Date dt)
    {
        dataConsulta=dt;
    }
    
    public Date ObtData ()
    {
        return dataConsulta;
    }
    
    public void DefHistoriaSocialPessoa(HPS hist)
    {
        histSocialPessoa = hist;
    }
   
    public HPS ObtHistoriaSocialPessoa(){
        
        return histSocialPessoa;
    }
    
    public void DefDiarioAlimentar(DiarioAlimentar diAlim)
    {
        drAlim = diAlim;
    }
    
}
