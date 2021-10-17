package td2;

import java.net.*;
import java.io.*;
import javax.swing.*;
import java.time.*;


public class SocketServerEx5 {


	public static void main(String[] args) throws IOException {
        ServerSocket servSocket= new ServerSocket(10001);
        Socket link = servSocket.accept();

        //BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
        PrintWriter out = new PrintWriter(link.getOutputStream(),true);

        out.println(java.time.LocalDateTime.now());
        //String input = in.readLine();

        link.close();
    }
}