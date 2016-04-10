package cn.hxdev.platform.exception;

import cn.hxdev.core.exception.BusinessException;

/**
 *
 * @author HXDEV.CN
 */
public class UniqueFieldException extends BusinessException {

    private boolean i18n = true;

    public boolean isI18n() {
        return i18n;
    }

    public void setI18n(boolean i18n) {
        this.i18n = i18n;
    }

    @Override
    public void check() throws UniqueFieldException {
        if (this.isNotEmpty()) {
            throw this;
        }
    }
}