package com.spacestar.back.alarm.service;

import org.springframework.stereotype.Service;

import com.spacestar.back.alarm.domain.Alarm;
import com.spacestar.back.alarm.dto.Req.AlarmAddReqDto;
import com.spacestar.back.alarm.dto.Res.AlarmListResDto;
import com.spacestar.back.alarm.enums.AlarmType;
import com.spacestar.back.alarm.repository.AlarmRepository;
import com.spacestar.back.global.GlobalException;
import com.spacestar.back.global.ResponseStatus;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlarmServiceImpl implements AlarmService {

	private final AlarmRepository alarmRepository;

	// 알림 리스트 조회
	@Override
	public AlarmListResDto getAlarmList(String uuid){
		return AlarmListResDto.builder()
			.alarmList(alarmRepository.findAlarmList(uuid))
			.build();
	}

	// 알림 등록
	@Override
	public void addAlarm(AlarmAddReqDto alarmAddReqDto){

		alarmRepository.save(Alarm
				.builder()
				.alarmType(alarmAddReqDto.getAlarmType())
				.receiverUuid(alarmAddReqDto.getReceiverUuid())
				.senderUuid(alarmAddReqDto.getSenderUuid())
				.content(alarmAddReqDto.getContent())
				.build());
	}
}
