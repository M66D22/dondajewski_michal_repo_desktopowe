/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listazakupow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michał
 */
public class HowManyProducts {
    public String file_name = "lista_zakupow.csv";
    
    public void ileProduktow(){
        System.out.println("Dziala");
        int ile = 0;
        try {
            Scanner sc = new Scanner(new File(file_name));
            while (sc.hasNext()){
                sc.nextLine();
                ile++;
            }
            System.out.println("Laczna ilosc produktow wynosi: "+ile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HowManyProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
