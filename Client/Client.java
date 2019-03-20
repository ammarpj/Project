import java.io.*;

import java.net.*;

class Client

{

  public static void main(String[] args) throws Exception

  {

     Socket sock = new Socket("192.168.154.133", 8080);

     BufferedReader keyRead = new BufferedReader(new 
InputStreamReader(System.in));

     OutputStream ostream = sock.getOutputStream(); 

     PrintWriter pwrite = new PrintWriter(ostream, true);

     InputStream istream = sock.getInputStream();

     BufferedReader receiveRead = new BufferedReader(new 
InputStreamReader(istream));



     System.out.println("You are connected to Server. Say hello!");



     String receiveMessage, sendMessage;               

     while(true)

     {

        sendMessage = keyRead.readLine(); 

        pwrite.println(sendMessage);       

        pwrite.flush();                    

        if((receiveMessage = receiveRead.readLine()) != null) 

        {  

          System.out.println("Server: " + receiveMessage); 

        }         

      }               

    }                    

}  
