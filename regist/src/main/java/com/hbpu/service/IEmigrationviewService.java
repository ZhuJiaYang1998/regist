package com.hbpu.service;

import com.hbpu.dto.DataDto;
import com.hbpu.vo.Emigrationview;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hbpu.dto.PageResult;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author jobob
 * @since 2021-02-19
 */
public interface IEmigrationviewService extends IService<Emigrationview> {
    public PageResult<Emigrationview> listEmigrationByWhere(DataDto<Emigrationview> dataDto);
}
