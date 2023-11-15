/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NutriX_BO;

/**
 *
 * @author migueloliveira
 */

enum TipoAgua{
    AguaMineral,
    AguaMineralNatural, //Monchique 
    AguaFiltrada,
    AguaPurificada,
    AguaComGas, //Agua das pedras
    
}
// Agua : CaracteristicasLiquidos - C#
public class Agua extends CaracteristicasLiquidos {
    
    int quantidade; //em ml
    TipoAgua tAgua;
    
    public Agua(){
        
    }
    
    //SET GET
    public void DefQuantidadeAgua(int q)
    {
        quantidade=q;
    }
    public int ObtQuantidade()
    {
        return quantidade;

    }
    public void DefTipoAgua(TipoAgua tAgua)
    {
        this.tAgua = tAgua;
    }
    
    public TipoAgua ObtTipoAgua(){
        return this.tAgua;
    }
    
    
}
