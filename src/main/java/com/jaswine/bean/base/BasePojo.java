package com.jaswine.bean.base;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jaswine.json.serializer.CustomLocalDateTimeSerializer;
import com.jaswine.serial.SnowFlake;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * POJO公共属性
 *
 * @author jaswine
 */
@Data
public abstract class BasePojo implements Serializable {


	/** 主键 */
	@TableId(type = IdType.ID_WORKER_STR)
	private long id = SnowFlake.nextId();
	/** 创建人 */
	private String createdBy =  "DEFAULT";
	/** 更新人 */
	private String updatedBy =  "DEFAULT";
	/** 创建时间 */
	@JsonSerialize(using = CustomLocalDateTimeSerializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdTime ;
	/** 更新时间 */
	@JsonSerialize(using = CustomLocalDateTimeSerializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime updatedTime ;

}
