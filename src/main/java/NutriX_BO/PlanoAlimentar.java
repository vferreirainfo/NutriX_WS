/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NutriX_BO;
import java.util.Date;
import java.util.List;
/**
 *
 * @author ioutlet
 */
public class PlanoAlimentar {
   
    
    //Plano alimentar contem um conjunto de refeicoes
    //plano alimentar pertence a uma Pessoa
    //List<Refeicao> conjRefeicoes;
    
    //variaveis
    List<Refeicao> conjRefeicoes;
    Date dtRefeicao;
    
    
    //Construtores
    public PlanoAlimentar(){}
    
    
    //SET e GET
    public void DefRefeicao(List<Refeicao> lRef)
    {
        conjRefeicoes = lRef;
    }
    public List<Refeicao> ObtRefeicao()
    {
        return conjRefeicoes;
    }
    
    
}
