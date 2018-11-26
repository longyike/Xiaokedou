package cn.appsys.service.developer;

import cn.appsys.pojo.DevUser;

/**
 * @author: LYK
 * @date: 2018/11/26
 * @package cn.appsys.service.developer
 * @description: TODO
 */
public interface DevUserService {
    public DevUser login(String devCode,String password);
}
