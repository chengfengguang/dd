package com.qf.j1808.service.impl;

import com.qf.j1808.Student;
import com.qf.j1808.service.StuService;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class StuServiceImpl implements StuService {
    @Override
    public List<Student> queryAll() {
        //创建一个可关闭的java访问webservice客户端(httpClient)
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个request对象
        String url = "http://localhost:8080/users";
        HttpGet httpGet = new HttpGet(url);

        try {
            CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);
            int code = closeableHttpResponse.getStatusLine().getStatusCode();
            if (code==200){
                HttpEntity httpEntity = closeableHttpResponse.getEntity();
                String json = EntityUtils.toString(httpEntity);
                System.out.println(json);

            }else {
                System.out.println("sorry");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
