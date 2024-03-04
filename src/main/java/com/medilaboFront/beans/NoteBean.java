package com.medilaboFront.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NoteBean {
//	private String id;
	private Integer patId;
	private String patient;
	private String note;

}
