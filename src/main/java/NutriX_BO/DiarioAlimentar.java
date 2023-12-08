/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NutriX_BO;
import java.util.Date;
/**
 *
 * @author migue
 */
public class DiarioAlimentar {
    
    Refeicao r;
    Date dt;
    
    
    public DiarioAlimentar(){
        
    }
    
    
    public void DefRefeicao(Refeicao ref)
    {
        r = ref;
    }
    public Refeicao Obtrefeicao()
    {
        return r;
    }
    public void DefDataRefeicao(Date dtRef)
    {
        dt = dtRef;
    }
    public Date ObtDataRefeicao()
    {
        return dt;
    }
    
    
}
