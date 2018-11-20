package com.fhzz.psop.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class ImageUtils {
	/**
     * 字符串转图片
     * @param imgStr --->图片字符串
     * @param filename    --->图片名
     * @return
     */
    @SuppressWarnings("restriction")
	public static boolean generateImage(String imgStr, OutputStream outputStream) {
        if (imgStr == null) {
            return false;
        }
       BASE64Decoder decoder = new BASE64Decoder();
        try {
            // 解密
            byte[] b = decoder.decodeBuffer(imgStr);
            // 处理数据
            for(int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            outputStream.write(b);
            outputStream.flush();
            outputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
        
    }
    
    /**
     * 图片转字符串
     * @param filePath    --->文件路径
     * @return
     */
    @SuppressWarnings("restriction")
	public static String getImageStr(InputStream imageStream ) {
        byte[] data = null;
        try {
            data = new byte[imageStream.available()];
            imageStream.read(data);
            imageStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 加密
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);
    }
    
}
