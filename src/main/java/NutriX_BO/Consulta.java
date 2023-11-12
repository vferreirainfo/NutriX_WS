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
    HPS histSocialPessoal;
    DiarioAlimentar drAlim;
    
    
    //
    public Consulta(){
        
    }
    
    public void DefData(Date dt)
    {
        dataConsulta=dt;
    }
    
}
