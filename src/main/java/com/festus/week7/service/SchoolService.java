package com.festus.week7.service;

import com.festus.week7.dao.SchoolEntity;
import com.festus.week7.dao.SchoolRepository;
import com.festus.week7.model.ResponseData;
import com.festus.week7.model.SchoolRequestData;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;
    public ResponseData addSchool(SchoolRequestData schoolRequestData) {
        ResponseData responseData = new ResponseData();

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        SchoolEntity schoolEntity = modelMapper.map(schoolRequestData, SchoolEntity.class);

        try {
            schoolRepository.save(schoolEntity);


        }
        catch (Exception e) {
    
        }
    }
}
