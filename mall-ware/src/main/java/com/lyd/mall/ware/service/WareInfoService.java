package com.lyd.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyd.common.utils.PageUtils;
import com.lyd.mall.ware.entity.WareInfoEntity;
import com.lyd.mall.ware.vo.FareVo;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author liuyunda
 * @email man021436@163.com
 * @date 2020-12-29 00:28:36
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * @Description: 根据收货地址计算运费
     * @Param: [addrId]
     * @return: com.lyd.mall.ware.vo.FareVo
     * @Author: Liuyunda
     * @Date: 2021/6/6
     */
    FareVo getFare(Long addrId);
}

