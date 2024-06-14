package com.spacestar.back.alarm.vo.Req;

import java.time.LocalDateTime;

import com.spacestar.back.alarm.enums.AlarmType;

import lombok.Getter;

@Getter
public class AlarmAddReqVo {

	private String alarmType;
	private String receiverUuid;
	private String senderUuid;
	private LocalDateTime createdAt;
	private String content;
}
