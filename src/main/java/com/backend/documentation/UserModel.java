package com.backend.documentation;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserModel {
	@ApiModelProperty(notes = "User generated id")
	private int userId;
	@ApiModelProperty(notes = "User name")
	private String userName;
	@ApiModelProperty(notes = "User address")
	private String userAddress;
	@ApiModelProperty(notes = "User age")
	private int age;
}
