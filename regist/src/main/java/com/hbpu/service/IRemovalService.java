package com.hbpu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hbpu.entity.Removal;
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
public interface IRemovalService extends IService<Removal> {
    public ResultDto<List> detailEchart();
    public ResultDto<List> emigrationEchart();
}
