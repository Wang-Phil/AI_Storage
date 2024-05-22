package com.aistorage.pojo;
/*
 *@version 1.0
 *@Author: WangWeicheng
 *@Date: 2024/5/22
 *@Time: 13:51
 */

import java.io.InputStream;

public class AmazonS3 {

    public void putObject(String bucketName, String objectKey, InputStream input, ObjectMetadata metadata) {
    }

    public S3Object getObject(String bucketName, String objectKey) {
        return null;
    }

    public void deleteObject(String bucketName, String objectKey) {
    }

    public ListObjectsV2Result listObjectsV2(String bucketName) {
        return null;
    }
}
