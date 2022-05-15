package com.example.javatspfci.code.entity.dto.order;

import com.example.javatspfci.code.entity.po.Tableware;
import lombok.Data;

import java.util.List;

@Data
public class OrderSetInfoDto {

    /**
     * 套餐信息
     */
    private List<Tableware> tableware;

    /**
     * 套餐数量
     */
    private Integer count;

    /**
     * 套餐总价
     */
    private Double price;

    public String toString(){
        StringBuffer sb = new StringBuffer("{");
        for (Tableware t:tableware) {
            sb.append(t.getTabName() + ",");
        }
        sb.append("} X " + count + ":" + price + "元");
        return sb.toString();
    }

}
