package td2;

import java.net.*;
import java.io.*;

public class Scanner {

    public static void main(String[] args)  throws IOException {
        
    	for (int i=10000; i<10010; i++) {
    		
    		try {
    			Socket link = new Socket(InetAddress.getLocalHost(),i);
    			System.out.println("Server is listening on port " + i + " of localhost");
    			link.close();
    		}
    		catch (Exception e) {
    			System.out.println("Server is not listening on port " + i + " of localhost");
    		}
    		
    	}
    	
        
    }
}