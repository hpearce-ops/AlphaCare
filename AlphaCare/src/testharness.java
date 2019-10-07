/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testharness;

import static Main.AlphaCare.selectUserAPI;

/**
 *
 * @author david
 */
public class testharness {
        public static void main(String[] args) {
        int selection = 1; 
        //listeners will determine which button user presses. 
        selectUserAPI(selection); 
        selection = 2;
        selectUserAPI(selection);
        selection = 3; 
        selectUserAPI(selection);
    }
}
