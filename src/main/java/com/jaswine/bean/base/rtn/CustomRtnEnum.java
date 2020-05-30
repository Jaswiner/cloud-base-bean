package com.jaswine.bean.base.rtn;


import lombok.Getter;

/**
 * 一般返回枚举类
 *
 * @author jaswine
 */
public enum CustomRtnEnum {

	/** 成功 */
	SUCCESS(200,"成功"),

	/** 一般错误 */
	ERROR_CUSTOM(400,""),
	/** SQL错误 */
	ERROR_BAD_SQL(10000,"SQL错误"),
	/** 查询为空 */
	ERROR_EMPTY_RESULT(10001,"查询为空"),
	/** 资源不存在 */
	RESOURCE_NON_EXIST(10002,"资源不存在"),
	/** 请求被熔断 */
	REQUEST_FUSED(10003,"请求被熔断");




	@Getter
	private Integer status;
	@Getter
	private String msg;



	CustomRtnEnum(Integer status, String msg){
		this.status = status;
		this.msg = msg;
	}

}
