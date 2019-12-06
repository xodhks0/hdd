package com.hdd.test.vo;

import lombok.Data;

@Data
public class UserVO {
	private int[] uiNums;
	private String uiName;
	private String uiId;
	private String uiPwd;
	private Integer uiNum;
	private String credat;
	private String cretim;
	private String moddat;
	private String modtim;
	private String active;
	private String[] search;
	private String searchStr;
}