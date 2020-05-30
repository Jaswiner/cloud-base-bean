package com.jaswine.bean.base.rtn;

import lombok.Getter;

/**
 * 网关Rtn
 *
 * @author : Jaswine
 * @date : 2020-05-31 00:31
 **/
public enum GatewayRtnEnum {


	/** 用户已经存在 */
	ERROR_USER_EXIST(4000,"用户已经存在");




	@Getter
	private Integer status;
	@Getter
	private String msg;



	GatewayRtnEnum(Integer status, String msg){
		this.status = status;
		this.msg = msg;
	}

}
