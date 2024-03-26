package com.festus.week7.controller;

import com.festus.week7.dao.SchoolEntity;
import com.festus.week7.model.ErrorResponseData;
import com.festus.week7.model.ResponseData;
import com.festus.week7.model.SchoolRequestData;
import com.festus.week7.model.SuccessResponseData;
import com.festus.week7.service.SchoolService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("schools")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @PostMapping("add")
    public ResponseEntity<ResponseData> saveNewSchool(@RequestBody SchoolRequestData schoolRequestData) {

        ResponseData responseData = new ResponseData();
        ErrorResponseData errorResponseData = new ErrorResponseData();

        errorResponseData = schoolRequestData.validateRequestData(schoolRequestData);

        if (errorResponseData != null) {
            responseData.setErrorResponseData(errorResponseData);
            return new ResponseEntity<ResponseData>(responseData, HttpStatus.BAD_REQUEST);
        }

        responseData = schoolService.addSchool(schoolRequestData);
    }


    @GetMapping("fetch")
    public ResponseEntity<ResponseData> getAllSchools() {

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<ResponseData> deleteSchool(@RequestParam Long id) {

    }

    @PutMapping("modify/{id}")
    public ResponseEntity<ResponseData> modifySchool(@RequestParam Long id) {

    }


}
