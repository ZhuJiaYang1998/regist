package com.hbpu.controller;


import com.hbpu.dto.DataDto;
import com.hbpu.vo.Emigrationview;
import com.hbpu.dto.PageResult;
import com.hbpu.service.IEmigrationviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * VIEW 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-02-19
 */
@RestController
@RequestMapping("/emigrationview")
@CrossOrigin
public class EmigrationviewController {
    @Autowired
    private IEmigrationviewService iEmigrationviewService;

    @PostMapping("/emgirtionList")
    public PageResult<Emigrationview> listEmigrationByWhere(@RequestBody DataDto<Emigrationview> dataDto){
        return iEmigrationviewService.listEmigrationByWhere(dataDto);
    }

}
