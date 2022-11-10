package com.bootcamp.patterns.command;

import com.bootcamp.patterns.command.interfaces.FileSystem;

public class UnixFileSystem implements FileSystem{

    @Override
    public void openFile() {
        System.out.println("Opening file in Unix OS.");
        
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix OS.");
        
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Unix OS.");
        
    }

}
