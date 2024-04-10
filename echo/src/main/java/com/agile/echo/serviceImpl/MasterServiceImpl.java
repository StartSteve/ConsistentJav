package com.agile.echo.serviceImpl;

import com.agile.echo.dto.CommonResponse;
import com.agile.echo.entity.MasterEntity;
import com.agile.echo.repository.MasterRepository;
import com.agile.echo.service.MasterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MasterServiceImpl implements MasterService {
    @Autowired
    private MasterRepository masterRepository;
    @Override
    public CommonResponse getAllMasterData() {
        CommonResponse res = new CommonResponse();
        List<MasterEntity> masterData = masterRepository.findAll();
        res.setData(masterData);
        res.setMessage("Master data get successfully !");
        return res;
    }
}
