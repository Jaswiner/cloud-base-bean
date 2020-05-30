package com.jaswine.bean.base;


import lombok.Data;

/**
 * 基础条件
 *
 * @author jaswine
 */
@Data
public abstract class BaseCd {

	/** 页码 */
	public Integer page;
	/** 条数 */
	public Integer limit;

}
