package com.medilaboFront.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.medilaboFront.beans.NoteBean;

@FeignClient(name = "medilaboNote", url = "localhost:8080")

public interface MicroserviceNoteProxy {

	@GetMapping("/notes/findAllNotes")
	public List<NoteBean> getNotes();

	@GetMapping("/notes/{id}")
	public List<NoteBean> getPatientNotes(@PathVariable("id") Integer id);

}
