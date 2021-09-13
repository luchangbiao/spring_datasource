// This file is auto-generated, don't edit it. Thanks.
package com.imooc.utils;

import com.aliyun.facebody20191230.models.CompareFaceRequest;
import com.aliyun.teaopenapi.models.Config;

public class Sample {

    /**
     * 使用AK&SK初始化账号Client
     *
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.facebody20191230.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 您的AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "facebody.cn-shanghai.aliyuncs.com";
        return new com.aliyun.facebody20191230.Client(config);
    }

    public static void main(String[] args_) throws Exception {
        java.util.List<String> args = java.util.Arrays.asList(args_);
        com.aliyun.facebody20191230.Client client = Sample.createClient("LTAI5tKoV7m4aCJbN814Budk", "f1ASWOplMqRdHuRZiCDGSE1TROvajv");
        CompareFaceRequest compareFaceRequest = new CompareFaceRequest()
                .setImageURLA("https://imooc-news-dev-lcb.oss-cn-shanghai.aliyuncs.com/images/456.jpg")
                .setImageURLB("https://imooc-news-dev-lcb.oss-cn-shanghai.aliyuncs.com/images/123.jpg");
        // 复制代码运行请自行打印 API 的返回值
        client.compareFace(compareFaceRequest);

        System.out.println(client.compareFace(compareFaceRequest).getBody().getData().confidence);
    }
}