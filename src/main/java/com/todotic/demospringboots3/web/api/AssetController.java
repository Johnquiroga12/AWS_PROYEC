package com.todotic.demospringboots3.web.api;

import com.todotic.demospringboots3.modelo.vm.Asset;
import com.todotic.demospringboots3.service.S3service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/assets")
public class AssetController {
    @Autowired
    private S3service s3service;

    @PostMapping("/upload")
    Map<String, String> upload(@RequestParam MultipartFile file) {
        String key = s3service.putObject(file);

        Map<String, String> result = new HashMap<>();
        result.put("key", key);

        result.put("url", s3service.getObjectUrl(key));
        return result;
    }

    @GetMapping(value = "/get-object", params = "key")
    ResponseEntity<ByteArrayResource> got0nject(@RequestParam String key) {
        Asset asset = s3service.getObject(key);
        ByteArrayResource resource = new ByteArrayResource(asset.getContent());

        return ResponseEntity
                .ok().header("Content-Type", asset.getContentType())
                .contentLength(asset.getContent().length)
                .body(resource);
    }

    @DeleteMapping(value = "/delete-object", params = "key")
    void deLetedbject(@RequestParam String key) {
    s3service.deleteObject(key);

    }
}