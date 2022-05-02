package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

public interface DeliveryStencil {

    /**
     * 获取全部配送员
     * @param path url路径
     * @return
     */
    public Result getAllDelivery(String path);

    /**
     * 通过id获取单个配送员信息
     * @param delID 配送员ID
     * @param path url路径
     * @return
     */
    public Result getOneDeliveryByID(String delID, String path);

    /**
     * 修改密码
     * @param delID 配送员id
     * @param oldPassword  旧密码
     * @param newPassword  新密码
     * @param rwNewPassword 重新输入新密码
     * @param path url路径
     * @return
     */
    public Result updatePassword(String delID,String oldPassword,String newPassword,String rwNewPassword,String path);
}
