package com.supremepole.exception.user;

/**
 * @author supremepole
 */
public class CaptchaExpireException extends UserException{
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}
