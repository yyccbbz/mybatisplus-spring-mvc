package com.baomidou.springmvc.controller.main;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.springmvc.common.utils.IntegerUtil;
import com.baomidou.springmvc.common.utils.StringUtil;
import com.baomidou.springmvc.controller.BaseController;
import com.baomidou.springmvc.model.main.ClExtUser;
import com.baomidou.springmvc.service.main.IClExtUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * <p>
 * 外部拓展客户  前端控制器
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@Controller
@RequestMapping("/clextuser")
public class ClExtUserController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClExtUserController.class);

    @Autowired
    private IClExtUserService clExtUserService;

    /**
     * 根据搜索条件分页查询
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/findByPage")
    public Page<ClExtUser> findByPage(HttpServletRequest request) {
        //获取前台传递过来的参数
        HashMap<String, String> params = getParamMap(request);
        LOGGER.debug("currentPage:" + IntegerUtil.getIntZero(params.get("currentPage")) +
                ", pageSize:" + IntegerUtil.getIntZero(params.get("pageSize")) +
                ", search:" + StringUtil.getStrEmpty(params.get("search")));

        return this.clExtUserService.findByPage(params);
    }

}
