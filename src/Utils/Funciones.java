/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.Random;

/**
 *
 * @author valeriazampetti
 */
public class Funciones {
    
    public static int get_Random(int min, int max){
        var rand = new Random();
        return rand.nextInt(max + 1 - min) + min;
        
    }
            
}
