/**
 * 
 */
package com.fhzz.psop.controller.activiti;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fhzz.psop.service.ActivitiService;
import com.fhzz.psop.util.ImageUtils;
import com.fhzz.psop.util.ProcessKey;

/**
 * @author Administrator
 *
 */
@RestController
public class ActivitiController {

	@Resource
	private ActivitiService activitiService;

	@RequestMapping("/startProcessInstanceByKey")
	public String startProcessInstanceByKey() {
		return activitiService.startProcessInstanceByKey("1505022341", ProcessKey.VACATION_PROCESS);
	}

	@RequestMapping("/completeProcessInstanceById")
	public boolean completeProcessInstanceById() {
		Map<String, Object> vars = new HashMap<>(4);
		vars.put("applyCustId", "1505022341");
		vars.put("days", 5);
		vars.put("reason", "老子要請假");
		activitiService.completeProcessInstanceById("1505022341", "12508", vars);
		return true;
	}

	@RequestMapping(value = "/getFlowImg/{processInstanceId}")
	public void getFlowImgByInstantId(@PathVariable("processInstanceId") String processInstanceId,
			HttpServletResponse response) {
		try {
			String imgStr = activitiService.getFlowImgByInstanceId(processInstanceId);
			OutputStream outputStream = response.getOutputStream();
			ImageUtils.generateImage(imgStr, outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
