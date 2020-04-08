import java.io.*;
import java.net.*;
public class PictureDownload { 
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        URL url=new URL("https://e.ecimg.tw/items/DDAFTT1900A5TFV/000001_1586257063.jpg");
        URLConnection cn=url.openConnection();
        System.out.println("Size:"+cn.getContentLength()+" bytes");
        FileOutputStream fs=new FileOutputStream("c:/temp/pchome.jpg");
        byte[ ]  bt=new byte[1024];
        int size=0;
        InputStream in=cn.getInputStream();
        while((size=in.read(bt))>0)
            fs.write(bt, 0, size);
        fs.close();
        System.out.println("Saved");
    }
    
}
