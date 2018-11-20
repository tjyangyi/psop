package com.fhzz.psop.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fhzz.psop.entity.VacTask;
import com.fhzz.psop.entity.Vacation;
import com.fhzz.psop.service.VacationService;
import com.fhzz.psop.util.ActService;

/**
 * @author Created by yawn on 2018-01-08 13:42
 */
@RestController
public class VacationController {

//	@Resource
//	private VacationService vacationService;
//
//	@Resource
//	private ActService actService;
//
//	@RequestMapping("/startVac")
//	public Object startVac() {
//		Vacation vac = new Vacation();
//		String userName = "yangyi";
//		return vacationService.startVac(userName, vac);
//	}
//
//	@RequestMapping("/myVac")
//	public Object myVac() {
//		String userName = "yangyi";
//		return vacationService.myVac(userName);
//	}
//
//	@RequestMapping(value = "/getFlowImg/{processInstanceId}")
//	public void getFlowImgByInstantId(@PathVariable("processInstanceId") String processInstanceId,
//			HttpServletResponse response) {
//		try {
//			System.out.println("processInstanceId:" + processInstanceId);
//			actService.getFlowImgByInstanceId(processInstanceId, response.getOutputStream());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@RequestMapping("/myAudit")
//	public Object myAudit() {
//		String userName = "yangyi";
//		return vacationService.myAudit(userName);
//	}
//
//	@RequestMapping("/passAudit")
//	public Object passAudit() {
//		String userName = "yangyi";
//		VacTask vacTask = new VacTask();
//		vacTask.setId("7516");
//		Vacation va = new Vacation();
//		va.setResult("爷同意了");
//		vacTask.setVac(va);
//		return vacationService.passAudit(userName, vacTask);
//	}
//
//	@RequestMapping("/myVacRecord")
//	public Object myVacRecord(HttpSession session) {
//		String userName = "yangyi";
//		return vacationService.myVacRecord(userName);
//	}
//
//	@RequestMapping("/myAuditRecord")
//	public Object myAuditRecord(HttpSession session) {
//		String userName = "yangyi";
//		return vacationService.myAuditRecord(userName);
//	}

}
