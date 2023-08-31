package com.example.restdemo.service.impl;

import com.example.restdemo.model.CloudVendor;
import com.example.restdemo.repository.CloudVendorRepository;
import com.example.restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImplement implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImplement(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Created successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Updated successfully";
    }

    @Override
    public String deleteCloudVendor(String id) {
        cloudVendorRepository.deleteById(id);
        return "Delete successfully";
    }

    @Override
    public CloudVendor getCloudVendor(String id) {
        return cloudVendorRepository.findById(id).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
