package com.spacestar.back.alarm.repository;

import java.util.List;

import com.spacestar.back.alarm.dto.Res.AlarmResDto;

public interface CustomAlarmRepository {

	List<AlarmResDto> findAlarmList(String uuid);
}
