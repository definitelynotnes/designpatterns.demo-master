package com.bootcamp.patterns.command;

import com.bootcamp.patterns.command.interfaces.FileSystem;
import com.bootcamp.patterns.command.util.FileSystemUtil;

public class FileSystemClient {
    public static void main(String[] args) {
        FileSystem fs = FileSystemUtil.getUnderlyingFileSystem();
        
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileExecutor fileExecutor = new FileExecutor(openFileCommand);
        fileExecutor.execute();
        
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        fileExecutor.setFileCommand(closeFileCommand);
        fileExecutor.execute();
        
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        fileExecutor.setFileCommand(writeFileCommand);
        fileExecutor.execute();
    }
}
