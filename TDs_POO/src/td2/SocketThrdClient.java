package td2;

import java.net.*;
import java.io.*;

public class SocketThrdClient {

    public static void main(String[] args)  throws IOException {
        

        Socket link = new Socket(InetAddress.getLocalHost(),10325);

        BufferedReader in =new BufferedReader(new InputStreamReader(link.getInputStream()));
        //PrintWriter out = new PrintWriter(link.getOutputStream(),true);

        //out.println("data client");
        String input = in.readLine();
        System.out.println(input);

        link.close();
    }
}