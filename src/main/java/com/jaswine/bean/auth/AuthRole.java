package com.jaswine.bean.auth;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 角色实体类
 *
 * @author Jaswine
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthRole  {

    private Long id;

	private String cnRoleName;

	private String enRoleName;

}
