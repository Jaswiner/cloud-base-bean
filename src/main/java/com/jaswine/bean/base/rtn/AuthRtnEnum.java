package com.jaswine.bean.base.rtn;

import lombok.Getter;

/**
 * 权限状态码
 * <CODE>4000-4999</CODE>
 * <ul>
 *     <li>User Code : 4000~4099</li>
 *     <li>Role Code : 4100~4199</li>
 *     <li>Permission Code : 4200~4299</li>
 * </ul>
 *
 * @author : Jaswine
 * @date : 2020-05-31 00:26
 **/
public enum AuthRtnEnum {


	/** 用户已经存在 */
	ERROR_USER_EXIST(4000,"用户已经存在");




	@Getter
	private Integer status;
	@Getter
	private String msg;



	AuthRtnEnum(Integer status, String msg){
		this.status = status;
		this.msg = msg;
	}
}
