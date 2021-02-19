package com.supremepole.exception.file;

import com.supremepole.exception.BaseException;

/**
 * 文件信息异常
 * @author supremepole
 */
public class FileException extends BaseException {

    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
