package cn.appsys.dao.devuser;

import cn.appsys.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author: LYK
 * @date: 2018/11/26
 * @package cn.appsys.dao.devuser
 * @description: TODO
 */
public interface DevUserMapper {
    /**
     * 根据devCode获取用户记录
     * @param devCode
     * @return
     */
    public DevUser getLoginUser(@Param("devCode") String devCode);

}
