package com.jaswine.bean.auth;

import lombok.Data;


/**
 * 安全权限的通用URL对象
 *
 * @author jaswine
 */
@Data
public class AuthUrl {

	/** HTTP 方法 */
	private String method;

	/** HTTP URL */
	private String url;
}
