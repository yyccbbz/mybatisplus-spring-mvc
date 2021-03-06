package com.baomidou.springmvc.service.main.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.springmvc.common.utils.IntegerUtil;
import com.baomidou.springmvc.common.utils.StringUtil;
import com.baomidou.springmvc.mapper.main.ClExtUserMapper;
import com.baomidou.springmvc.model.main.ClExtUser;
import com.baomidou.springmvc.service.main.IClExtUserService;
import com.baomidou.springmvc.service.support.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 外部拓展客户  服务实现类
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@Service
public class ClExtUserServiceImpl extends BaseServiceImpl<ClExtUserMapper, ClExtUser> implements IClExtUserService {

    @Override
    public Page<ClExtUser> findByPage(HashMap<String, String> params) {

        String search = StringUtil.getStrEmpty(params.get("search"));
        int current = IntegerUtil.getIntZero(params.get("currentPage"));
        int size = IntegerUtil.getIntZero(params.get("pageSize"));
        Page<ClExtUser> page = new Page<>(current, size);

        List<ClExtUser> recordsList = baseMapper.selectPage(
                page,
                new EntityWrapper<ClExtUser>().like("phone_number", search)

        );

        page.setRecords(recordsList);
        System.out.println("page = " + page);
        System.out.println("总数 = " + page.getTotal() + "当前页 = " + page.getCurrent() + "每页大小 = "
                + page.getSize() + "数据集合 = " + page.getRecords());
        return page;
    }
}
