package org.dimigo.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by codertimo on 2015. 10. 26..
 */
public class SaveImageFromUrl {

    public static void main(String args[])
    {
        String web_url = "http://pds22.egloos.com/pds/201107/11/07/f0050207_4e1a52c120a44.jpg";
        try{
            URL url = new URL(web_url);

            try(InputStream is = url.openStream();
                OutputStream os = new FileOutputStream("/Users/codertimo/Desktop/james.jpg"))
            {
                int result;
                byte[] buffuer = new byte[100];
                while((result = is.read(buffuer)) != -1) {
                    os.write(buffuer, 0, result);
                }
                System.out.println("생성 완료");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
