package com.hbpu.service;

import com.hbpu.dto.DataDto;
import com.hbpu.dto.PageResult;
import com.hbpu.entity.Resident;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hbpu.dto.ResultDto;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2021-02-14
 */
public interface IResidentService extends IService<Resident> {
    PageResult<Resident> listPageResident(DataDto<Resident> dataDto);
    ResultDto saveResident(Resident resident);
    ResultDto<List> listResidentByWhere();
    ResultDto Verification(Resident resident);
    ResultDto<List> gainRegistById(String registId);
    ResultDto detailResident(Resident resident);
}
