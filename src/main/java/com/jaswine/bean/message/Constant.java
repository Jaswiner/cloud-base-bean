package com.jaswine.bean.message;

/**
 * 消息队列的常量
 *
 * @author : Jaswine
 * @date : 2020-05-18 21:05
 **/
public class Constant {

	/** 日志表 */
	public static final String LOG_TABLE_NAME = "operation_log";
	/** 路由表 */
	public static final String GATEWAY_TABLE_NAME = "gateway";


	/**=============================GROUP=================================*/

	public static final String ROCKET_MQ_GROUP = "gateway_manage";

	/**=============================TOPICS=================================*/

	/** 【Topic】新增路由  */
	public static final String MSG_TOPIC_ADD_GATEWAY = "add-gateway";
}
