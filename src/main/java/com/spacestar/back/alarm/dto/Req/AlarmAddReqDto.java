package com.spacestar.back.alarm.dto.Req;

import java.time.LocalDateTime;

import com.spacestar.back.alarm.enums.AlarmType;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AlarmAddReqDto {

	private AlarmType alarmType;
	private String receiverUuid;
	private String senderUuid;
	private String content;
}
