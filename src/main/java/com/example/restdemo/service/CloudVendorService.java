package com.example.restdemo.service;

import com.example.restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String id);
    public CloudVendor getCloudVendor(String id);
    public List<CloudVendor> getAllCloudVendor();

}
