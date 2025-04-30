package com.example.demo.controller;

import com.example.demo.model.MainObject;
import com.example.demo.model.SubObject;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    private MainObject storedObject = null;

    @PostMapping("/store")
    public void storeObject(@RequestBody MainObject mainObject) {
        this.storedObject = mainObject;
    }

    @DeleteMapping("/delete")
    public void deleteObject(@RequestParam String field1) {
        if (storedObject != null && storedObject.getField1().equals(field1)) {
            storedObject = null;
        }
    }

    @GetMapping(value = "/get", produces = "application/xml")
    public String getObjectAsXml() {
        if (storedObject == null) {
            return "<error>Object not found</error>";
        }
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.writeValueAsString(storedObject);
        } catch (Exception e) {
            return "<error>Error converting to XML</error>";
        }
    }

    @GetMapping(value = "/getSubObject", produces = "application/json")
    public SubObject getSubObject(@RequestParam int index) {
        if (storedObject == null || storedObject.getSubObjects() == null || index >= storedObject.getSubObjects().size()) {
            return null;
        }
        return storedObject.getSubObjects().get(index);
    }
}

