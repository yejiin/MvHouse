package com.ssafy.happyhouse.model.dto.notice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDto {

	private int nno;
	private String subject;
	private String content;
	private int hit;
	private String regtime;

}
