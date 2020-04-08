import java.io.*;
import java.net.*;
public class TextDownloadMain {

    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        URL url=new URL("http://car.pchome.com.tw/news_content.html?nid=37615");
        URLConnection cn=url.openConnection();        
        FileWriter fs=new FileWriter("c:/temp/pchome.txt");        
        int size=0;
        InputStream in=cn.getInputStream();
        InputStreamReader sr=new InputStreamReader(in,"UTF-8");
        int value=0;
        while((value=sr.read())!=-1){
            char ch=(char)value;
            fs.write(ch);
            System.out.print(ch);
        }
        fs.close();
        
    }
    
}
