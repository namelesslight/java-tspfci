package com.example.javatspfci.code.entity.dto.order;

import lombok.Data;

import java.util.List;

@Data
public class OrderInfoDto {

    /**
     * 配套信息
     */
    private OrderSetInfoDto set;

    /**
     * 其他餐具信息
     */
    private List<OrderOtherDto> other;


    public String toString(){
        StringBuffer sb = new StringBuffer(set.toString() + ",\r\n");
        for (OrderOtherDto otherDto : other) {
            sb.append(otherDto.getName() + " X " + otherDto.getCount() + " : " + otherDto.getPrice() + ",\r\n");
        }
        return sb.toString();
    }

}
