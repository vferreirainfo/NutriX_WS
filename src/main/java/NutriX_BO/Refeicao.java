/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NutriX_BO;
import java.util.List;
/**
 *
 * @author ioutlet
 */
public class Refeicao {
    
    //Refeicao pode conter 1 ou mais alimentos
    List<Alimento> conjAlimento;
    Agua ag;
    
    
    public Refeicao(){
        
    }
    
    //SET e GET
    
    
    //SET é void
    public void DefRefeicao(List<Alimento> lAlimento)
    {
        conjAlimento=lAlimento;
    }
    
    //GET tenho que incluir na declaração o tipo de Dados
    public List<Alimento> ObtAlimento()
    {
        return conjAlimento;
    }
    
}
