package com.supremepole.exception.file;

/**
 * 文件名大小限制异常类
 * @author supremepole
 */
public class FileSizeLimitExceededException extends FileException{
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("upload.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
