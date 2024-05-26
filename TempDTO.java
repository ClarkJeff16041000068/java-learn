package com.wx.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TempDTO {
    private BigDecimal totalSalesPrice;
    private Date createTime;
}
