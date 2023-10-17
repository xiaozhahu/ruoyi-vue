package com.ruoyi.netmanager.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.netmanager.domain.vo.StatisticUtilizationVo;
import com.ruoyi.netmanager.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author old.lazy.sexy
 * @description 网络管理-数据统计
 * @date 2023-10-17
 */
@RestController
@RequestMapping("/netm/statistic")
public class StatisticController extends BaseController {

    @Autowired
    private StatisticService statisticService;

    @GetMapping("/base")
    public AjaxResult base() {
        return success(statisticService.base());
    }

    @GetMapping("/networkHealth")
    public AjaxResult networkHealth() {
        return success(statisticService.networkHeath());
    }

    @GetMapping("/deviceTypes")
    public AjaxResult deviceTypes() {
        return success(statisticService.deviceTypes());
    }

    @GetMapping("/resourceTypes")
    public AjaxResult resourceTypes() {
        return success(statisticService.resourceTypes());
    }

    @GetMapping("/alarmLevels")
    public AjaxResult alarmLevels() {
        return success(statisticService.alarmLevels());
    }

    @GetMapping("/performance")
    public AjaxResult performance(@Validated @RequestBody StatisticUtilizationVo condition) {
        return success(statisticService.performance(condition));
    }
}
