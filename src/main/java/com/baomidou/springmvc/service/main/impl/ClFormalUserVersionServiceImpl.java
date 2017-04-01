package com.baomidou.springmvc.service.main.impl;

import com.baomidou.springmvc.mapper.main.ClFormalUserVersionMapper;
import com.baomidou.springmvc.model.main.ClFormalUserVersion;
import com.baomidou.springmvc.service.main.IClFormalUserVersionService;
import com.baomidou.springmvc.service.support.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 正式名单的版本表，该表关联user和adviser,记录客户和投顾的对应关系。  服务实现类
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@Service
public class ClFormalUserVersionServiceImpl extends BaseServiceImpl<ClFormalUserVersionMapper, ClFormalUserVersion> implements IClFormalUserVersionService {
	
}
