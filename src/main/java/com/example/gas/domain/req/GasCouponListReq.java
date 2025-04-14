package com.example.gas.domain.req;

import com.example.gas.domain.base.BaseReq;
import lombok.Data;

@Data
public class GasCouponListReq extends BaseReq {

    String receiver;

    String status;
}
