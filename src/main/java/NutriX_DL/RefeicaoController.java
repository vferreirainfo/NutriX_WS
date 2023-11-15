/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NutriX_DL;

import NutriX_BO.Agua;
import NutriX_BO.Alimento;
import NutriX_BO.Refeicao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author migueloliveira
 */
public class RefeicaoController {

    Refeicao r;
    File f;
    Alimento al;
    Agua ag;

    public RefeicaoController() {
        
        
        String encoding = "Cp1250";
        f = new File("/Users/migueloliveira/Documents/GitHub/NutriX_WS/Ficheiros/Alimentos.txt");
        
        //Testar se o ficheiro existe
        if (f.exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), encoding))) {
                String line = null;
                //Efetuar a leitra linha a linha ... No while
                while ((line = br.readLine()) != null) {
                    if(line.contains("HPA"))
                    {
                        al = new Alimento();
                        
                    }
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("file doesn't exist");
        }
    }

}
