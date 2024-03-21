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

    public static int get_Random(int min, int max) {
        var rand = new Random();
        return rand.nextInt(max + 1 - min) + min;

    }

    public static boolean try_Probability(int probability) {
        var random = get_Random(0, 100);

        return random <= probability;
    }

    public static int try_MultipleProbabilities(int[] probabilities) {
        int sum = 0;
        int randNum = get_Random(0, 100);
        for (int i = 0; i < probabilities.length; i++) {
            sum += probabilities[i];
            if (randNum < sum) {
                return i;
            }
        }

        if (sum == 100) {
            return probabilities.length - 1;
        }
        throw new IllegalArgumentException("Probabilities do not sum to 100");
    }

}
