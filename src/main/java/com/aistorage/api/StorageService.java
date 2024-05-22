package com.aistorage.api;
/*
 *@version 1.0
 *@Author: WangWeicheng
 *@Date: 2024/5/22
 *@Time: 13:49
 */

import java.io.InputStream;
import java.util.List;

public interface StorageService {
    void putObject(String bucketName, String objectKey, InputStream input);
    InputStream getObject(String bucketName, String objectKey);
    void deleteObject(String bucketName, String objectKey);
    List<String> listObjects(String bucketName);
}
