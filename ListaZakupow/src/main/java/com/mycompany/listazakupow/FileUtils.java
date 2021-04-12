/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listazakupow;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Michał
 */
public class FileUtils {
    private String file_name = "lista_zakupow.csv";
    
    public void saveToFile(String text){
        System.out.println(text);        
        try {
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text+"\n");
            fw.close();
        } catch (IOException ex) {
            System.out.println("Błąd "+ex);
        }
    } 
    
    public String readFromFile(){
        try {
            String message = "";
            Scanner sc = new Scanner(new File(file_name));
            while (sc.hasNext()){
//              String temp = sc.nextLine();
//              temp = temp.replaceAll(";", "\t");
//              message += temp+"\n"; 
                System.out.println("-"); 
                message += sc.nextLine().replaceAll(";", "\t")+"\n";
            }
            return message;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
            return "error";
        }
    }
}
