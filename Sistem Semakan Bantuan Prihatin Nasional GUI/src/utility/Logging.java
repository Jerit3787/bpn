/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author Danish Hakim
 */
public class Logging {
    public static void log(Exception help, Boolean expected) {
        if (expected = true) {
            System.out.println("[EXPECTED] " + help);
        }
        else {
            System.out.println("[UNEXPECTED] " + help);
        }
            
    }
}
