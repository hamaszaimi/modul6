/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;

/**
 *
 * @author reyna
 */
public class Kasir extends Thread {
    public void run() {
        System.out.println();    
        for(int i=1; i<=10; i++) {
            System.out.println("Pasien "+i+" membayar ke kasir");
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
