import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Connection{

public static void Connect() throws Exception{

// set URL

URL url = new URL("http://tutorialspoint.com");
URLConnection spoof = url.openConnection();

// spoof the connection so we look like web browser

spoof.setRequestProperty("USer-Agent", "Google Chrome/42.0.231.90(64-bit)");
BufferedReader in = new BufferedReader(new InputStreamReader(spoof.getInputStream()));

 String strLine = "";

// Loop through every line in the source

while((strLine = in.readLine()) !=null)
{

// print each line to console
System.out.println(strLine);

}

System.out.println("End of page.");

}

public static void main(String[] args){

try{
//calling the connect method
Connect();
}catch(Exception e){
    
     }
   }
}

