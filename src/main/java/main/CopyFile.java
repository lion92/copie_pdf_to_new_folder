package main;

import java.io.*;

public class CopyFile {
    public CopyFile(String srcPath, String destPath){
        File src = new File(srcPath);
        File dest = new File(destPath);
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) > 0) {
                os.write(buffer, 0, len);
            }
            is.close();
            os.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
