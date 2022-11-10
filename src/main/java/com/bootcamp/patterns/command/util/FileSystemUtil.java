package com.bootcamp.patterns.command.util;



import com.bootcamp.patterns.command.UnixFileSystem;
import com.bootcamp.patterns.command.WindowsFileSystem;
import com.bootcamp.patterns.command.interfaces.FileSystem;



public class FileSystemUtil {
    
    public static FileSystem getUnderlyingFileSystem() {
        final String operatingSystemNameString = System.getProperty("os.name");
        System.out.println("OS: " + operatingSystemNameString);
        
        if(operatingSystemNameString.contains("Windows")) {
            return new WindowsFileSystem();
        }
        return new UnixFileSystem();
    }



}