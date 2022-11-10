package com.bootcamp.patterns.command;

import com.bootcamp.patterns.command.interfaces.FileCommand;
import com.bootcamp.patterns.command.interfaces.FileSystem;

public class CloseFileCommand implements FileCommand{
    private FileSystem fileSystem;
    
    public CloseFileCommand(FileSystem fileSystem) {
        this.fileSystem=fileSystem;
    }
    
    @Override
    public void execute() {
        this.fileSystem.closeFile();
        
    }

}
