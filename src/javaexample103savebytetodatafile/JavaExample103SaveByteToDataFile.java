
package javaexample103savebytetodatafile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class JavaExample103SaveByteToDataFile {

    
    public static void main(String[] args) {
        
        try{
        
        File myFolder = MyHelper.CreateWorkingFolder("myWorkingFolder");
        
        MyHelper.FolderCheck(myFolder);
        
        File dataFile = MyHelper.CreateWorkingFile(myFolder, "myData.dat");
        
        MyHelper.FileCheck(dataFile);
        
        /*
        
        A file output stream is an output stream for writing data to a File or 
        to a FileDescriptor. Whether or not a file is available or may be 
        created depends upon the underlying platform. Some platforms, 
        in particular, allow a file to be opened for writing by only one 
        FileOutputStream (or other file-writing object) at a time. In such 
        situations the constructors in this class will fail if the file 
        involved is already open.
        
        FileOutputStream is meant for writing streams of raw bytes such as
        image data. For writing streams of characters, consider using FileWriter.
        */
        FileOutputStream fos = new FileOutputStream(dataFile.getPath());
        
        int a = 55;
        char b = '+';
        // byte type [-128 .. 127]
        byte c = 127 ;
        byte[] d = {1, 2, 3, 4, 5};
        
        fos.write(2);
        fos.write(a);
        fos.write('A');
        fos.write(b);
        fos.write(c);
        fos.write(d);
        
        // close
        fos.close();
    }//end-try
        
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
