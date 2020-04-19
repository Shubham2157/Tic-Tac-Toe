/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic2tactoe;

import TicTacTes.TicTacToe_s;

/**
 *
 * @author KIIT
 */
public class Tic2TacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_s().setVisible(true);
            }
        });
    }
    
}
