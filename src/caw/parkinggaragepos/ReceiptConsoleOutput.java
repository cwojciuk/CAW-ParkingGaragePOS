/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caw.parkinggaragepos;

/**
 *
 * @author Charles Wojciuk
 */
public class ReceiptConsoleOutput implements ReceiptOutputStrategy{

    @Override
    public void outputReceipt(String output) {
        System.out.println();
    }
    
}
