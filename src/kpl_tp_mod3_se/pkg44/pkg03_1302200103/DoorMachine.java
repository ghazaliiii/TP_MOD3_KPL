/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpl_tp_mod3_se.pkg44.pkg03_1302200103;

/**
 *
 * @author faishal
 */
public class DoorMachine {
    private String state = "Terkunci";
    public void pintu(String command) {
        command = command.toLowerCase();
        switch (command) {
            case "bukapintu":
                this.state = "Terbuka";
                break;
            case "kuncipintu":
                this.state = "Terkunci";
                break;
        }
    }
    public String getState(){
        return this.state;
        
    }
}
    
