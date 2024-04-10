package com.agile.echo.controller;

import com.agile.echo.dto.CommonResponse;
import com.agile.echo.service.MasterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MasterData")
@Slf4j
public class MasterDataController {
    @Autowired
    private MasterService masterService;
    @GetMapping
    public ResponseEntity<CommonResponse> getMasterData(){
            CommonResponse res = masterService.getAllMasterData();
            return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
