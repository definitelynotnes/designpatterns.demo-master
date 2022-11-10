package com.bootcamp.patterns.command;

import com.bootcamp.patterns.command.interfaces.FileCommand;

public class FileExecutor {
    private FileCommand fileCommand;
    
    public FileExecutor(FileCommand fileCommand) {
        this.fileCommand = fileCommand;
    }
    
    public void execute() {
        this.fileCommand.execute();
    }
    
    public void setFileCommand(FileCommand fileCommand) {
        this.fileCommand = fileCommand;
    }
}
