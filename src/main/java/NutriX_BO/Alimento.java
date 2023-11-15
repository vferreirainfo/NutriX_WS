/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NutriX_BO;

/**
 *
 * @author ioutlet
 */

enum TipoAlimento
{
    Cru_Natural, //Cru ou natural
    Cozido,
    Guisado,
    Frito,
    Grelhado,
    Assado,
}

enum GeneroAlimento
{
    liquido, //bebidas
    solido, //qualquer alimento
}
public class Alimento {
    
    
    String desc; // Arroz-Batata-Massa Esparguete
    TipoAlimento formaConsumo; //A forma como é consumido
    GeneroAlimento genAlimento;
    CaracteristicasAlimentares ca; // tabela nutricional
    int quant; // quantidade
  
    
    
    //Construtor
    public Alimento(){
        
    }
    
    public Alimento(TipoAlimento a, CaracteristicasAlimentares cAl)
    {
        formaConsumo = a;
        ca = cAl;
    }
    
    //GET e SET
    public void DefTipoAlimento(TipoAlimento al)
    {
        formaConsumo = al;
    }
    
    public TipoAlimento ObtTipoAlimento(){
        return formaConsumo;
    }
    
    public void DefGeneroAlimento(GeneroAlimento gAlim)
    {
        genAlimento = gAlim;
    }
    
    public GeneroAlimento ObtGeneroAlimento(){
        return genAlimento;
    }
    
    
    
    
         
}

