package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\ReceiptConsoleOutput.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

public class ReceiptConsoleOutput implements ReceiptOutputStrategy{

    @Override
    public void outputReceipt(String output) {
        System.out.println();
    }
    
}
