package com.supremepole.common.exception.user;

import com.supremepole.common.exception.BaseException;

/**
 * 用户信息异常类
 * @author supremepole
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
