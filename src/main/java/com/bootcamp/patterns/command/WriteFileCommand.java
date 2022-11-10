package com.bootcamp.patterns.command;

import com.bootcamp.patterns.command.interfaces.FileCommand;
import com.bootcamp.patterns.command.interfaces.FileSystem;

public class WriteFileCommand implements FileCommand{
    private FileSystem fileSystem;
    
    public WriteFileCommand(FileSystem fileSystem) {
        this.fileSystem=fileSystem;
    }
    
    @Override
    public void execute() {
        this.fileSystem.writeFile();
        
    }

}
