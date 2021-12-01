package com.hbpu.controller;


import com.hbpu.dto.DataDto;
import com.hbpu.dto.PageResult;
import com.hbpu.dto.Particular;
import com.hbpu.service.IParticularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * VIEW 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-02-16
 */
@RestController
@RequestMapping("/particular")
@CrossOrigin
public class ParticularController {
    @Autowired
    private IParticularService iParticularService;

    @PostMapping("/searchParticular")
    public PageResult<Particular> listParticularByWhere(@RequestBody DataDto<Particular> dataDto){
        return iParticularService.listParticularByWhere(dataDto);
    }


}
