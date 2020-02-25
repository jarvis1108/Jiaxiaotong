package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import java.io.UnsupportedEncodingException;

public interface QRCodeLoginService {
    String getAuthUrl() throws UnsupportedEncodingException;
}
