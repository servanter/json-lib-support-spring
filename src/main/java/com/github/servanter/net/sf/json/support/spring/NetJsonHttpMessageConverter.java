package com.github.servanter.net.sf.json.support.spring;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

/**
 * Net json lib support for spring.
 * 
 * @author zhanghongyan
 *
 */
public class NetJsonHttpMessageConverter extends AbstractHttpMessageConverter<Object> {

    private static String CHARSET = "UTF-8";

    private static String TYPE = "application/json";

    private static String CONTENT_TYPE = TYPE + ";charset=" + CHARSET;

    /**
     * Set return code charset
     * 
     * @param charset
     */
    public void setCharset(String charset) {
        CHARSET = charset;
        changeContentType();
        addMediaType();
    }

    private void addMediaType() {
        setSupportedMediaTypes(Collections.singletonList(MediaType.valueOf(CONTENT_TYPE)));
    }

    public void changeContentType() {
        CONTENT_TYPE = TYPE + ";charset=" + CHARSET;
    }

    /**
     * default Media Type
     */
    public NetJsonHttpMessageConverter() {
        super(MediaType.valueOf(CONTENT_TYPE));
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        InputStream in = inputMessage.getBody();

        byte[] buf = new byte[1024];
        for (;;) {
            int len = in.read(buf);
            if (len == -1) {
                break;
            }
            if (len > 0) {
                baos.write(buf, 0, len);
            }
        }
        JSONObject json = JSONObject.fromObject(new String(buf));
        return JSONObject.toBean(json, clazz);
    }

    @Override
    protected void writeInternal(Object t, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        OutputStream outputStream = outputMessage.getBody();
        outputStream.write(JSONSerializer.toJSON(t).toString().getBytes(CHARSET));
    }

}
