package com.aistorage;
/*
 *@version 1.0
 *@Author: WangWeicheng
 *@Date: 2024/5/22
 *@Time: 13:54
 */

import com.aistorage.api.StorageService;
import com.aistorage.api.impl.S3StorageService;
import com.aistorage.pojo.AmazonS3;
import com.aistorage.pojo.AmazonS3Client;
import com.aistorage.pojo.PosixStorageService;

public class StorageSeriveFactory {
    public static StorageService getStorageService(String type) {
        switch (type) {
            case "S3":
                AmazonS3 s3Client = new AmazonS3Client();
                return new S3StorageService(s3Client);
            case "POSIX":
                return (StorageService) new PosixStorageService();
            // Add other storage types here
            default:
                throw new IllegalArgumentException("Unsupported storage type: " + type);
        }
    }
}
