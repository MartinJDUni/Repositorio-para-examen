/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javafx.scene.control.TextArea;

/**
 *
 * @author Martín
 */
public class Lista extends Thread{
    char[] vector;
    TextArea Area;

    public Lista(char[] vector, TextArea Area) {
        this.vector = vector;
        this.Area = Area;
    }

    public char[] getVector() {
        return vector;
    }
    
    private void pausar(int tiempo) {
       try {
       Thread.sleep(tiempo * 125);
       } catch (InterruptedException ex) {
       Thread.currentThread().interrupt();
       }
    }
    
    @Override
    public void run() {
        
        for(int i=0;i<vector.length;i++){
            Area.setText(String.valueOf(vector));
            //aca vemos el numero que representa
            int a = vector[i];
            pausar(1);
            //para cuando es el primero
            if(i==0){
                vector[i]=Character.toUpperCase(vector[i]);
               
            }else
            {
                int b = vector[i-1];
                //Para cuando no es el primero
                if(b==32){
                    vector[i]=Character.toUpperCase(vector[i]);
                }
            }
            pausar(1);
          Area.setText(String.valueOf(vector));
        }
    }
    
}
