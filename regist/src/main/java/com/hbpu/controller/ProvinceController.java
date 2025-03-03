package com.hbpu.controller;


import com.hbpu.dto.ResultDto;
import com.hbpu.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-02-14
 */
@RestController
@RequestMapping("/province")
@CrossOrigin
public class ProvinceController {
    @Autowired
    private IProvinceService iProvinceService;


    @GetMapping("/listProvince")
    public ResultDto<List> listProvince(){
        return iProvinceService.listProvince();
    }

}
