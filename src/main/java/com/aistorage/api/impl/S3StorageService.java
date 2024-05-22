package com.aistorage.api.impl;
/*
 *@version 1.0
 *@Author: WangWeicheng
 *@Date: 2024/5/22
 *@Time: 13:50
 */

import com.aistorage.api.StorageService;
import com.aistorage.pojo.AmazonS3;
import com.aistorage.pojo.ListObjectsV2Result;
import com.aistorage.pojo.ObjectMetadata;
import com.aistorage.pojo.S3Object;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class S3StorageService implements StorageService {
    private final AmazonS3 s3Client;
    private Object S3ObjectSummary;

    public S3StorageService(AmazonS3 s3Client) {
        this.s3Client = s3Client;
    }

    @Override
    public void putObject(String bucketName, String objectKey, InputStream input) {
        ObjectMetadata metadata = new ObjectMetadata();
        s3Client.putObject(bucketName, objectKey, input, metadata);
    }

    @Override
    public InputStream getObject(String bucketName, String objectKey) {
        S3Object s3Object = s3Client.getObject(bucketName, objectKey);
        return s3Object.getObjectContent();
    }

    @Override
    public void deleteObject(String bucketName, String objectKey) {
        s3Client.deleteObject(bucketName, objectKey);
    }

    @Override
    public List<String> listObjects(String bucketName) {
        ListObjectsV2Result result = s3Client.listObjectsV2(bucketName);
        return null;
    }
}
