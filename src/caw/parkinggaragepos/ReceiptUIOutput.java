package caw.parkinggaragepos;

import javax.swing.JOptionPane;

/**
 * caw.parkinggaragepos\ReceiptUIOutput.java
 * Oct 18, 2012 11:52:24 AM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

/*
 *Class description here
 */
public class ReceiptUIOutput implements ReceiptOutputStrategy{
    @Override
    public void outputReceipt(String output) {
        JOptionPane.showMessageDialog(null, output);
    }
}
