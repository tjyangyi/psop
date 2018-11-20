/**
 * 
 */
package com.fhzz.psop.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 *
 */
@FeignClient(value = "psop-activiti")
public interface ActivitiService {

	@RequestMapping(value = "/activiti/startProcessInstanceByKey")
	public String startProcessInstanceByKey(@RequestParam(value = "custId") String custId,
			@RequestParam(value = "key") String key);

	@RequestMapping(value = "/activiti/completeProcessInstanceById")
	public void completeProcessInstanceById(@RequestParam(value = "custId") String custId,
			@RequestParam(value = "processInstanceId") String processInstanceId, @RequestBody Map<String, Object> vars);

	@RequestMapping(value = "/activiti/getFlowImgByInstanceId")
	public String getFlowImgByInstanceId(@RequestParam(value = "processInstanceId") String processInstanceId);

}
