package com.hbpu.service;

import com.hbpu.dto.DataDto;
import com.hbpu.dto.PageResult;
import com.hbpu.dto.Particular;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author jobob
 * @since 2021-02-16
 */
public interface IParticularService extends IService<Particular> {
    public PageResult<Particular> listParticularByWhere(DataDto<Particular> dataDto);
}
