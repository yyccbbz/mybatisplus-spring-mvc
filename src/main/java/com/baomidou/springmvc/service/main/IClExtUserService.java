package com.baomidou.springmvc.service.main;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.springmvc.model.main.ClExtUser;

import java.util.HashMap;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
public interface IClExtUserService extends IService<ClExtUser> {

    Page<ClExtUser> findByPage(HashMap<String, String> params);
}
