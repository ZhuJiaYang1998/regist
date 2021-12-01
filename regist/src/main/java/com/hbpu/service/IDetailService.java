package com.hbpu.service;

import com.hbpu.dto.ResultDto;
import com.hbpu.entity.*;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2021-02-14
 */
public interface IDetailService extends IService<Detail> {
    public ResultDto saveOrUpdateDetail(Detail detail);
    public ResultDto emigration(Emigration emigration);
}
