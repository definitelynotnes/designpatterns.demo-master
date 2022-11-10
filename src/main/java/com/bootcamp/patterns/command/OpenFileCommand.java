package com.bootcamp.patterns.command;

import com.bootcamp.patterns.command.interfaces.FileCommand;
import com.bootcamp.patterns.command.interfaces.FileSystem;

public class OpenFileCommand implements FileCommand{
    private FileSystem fileSystem;
    
    public OpenFileCommand(FileSystem fileSystem) {
        this.fileSystem=fileSystem;
    }
    
    @Override
    public void execute() {
        this.fileSystem.openFile();
        
    }

}
