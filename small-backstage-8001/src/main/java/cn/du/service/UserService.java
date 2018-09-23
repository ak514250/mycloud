package cn.du.service;

import cn.du.api.base.BaseService;
import cn.du.po.TbUser;
import cn.du.po.TbUserExample;

import java.util.List;

/**
 * @InterfaceName UserService
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/23 16:52
 **/
public interface UserService extends BaseService<TbUser, TbUserExample> {

    List<TbUser> getUsers();
}
