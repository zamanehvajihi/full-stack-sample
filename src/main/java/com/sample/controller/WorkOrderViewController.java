package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkOrderViewController {
	
	@GetMapping("work-order-list")
    public String workOrderHtml() {
      return "work-order-list.html";
    }
	
	@GetMapping("/work-order-list.js")
    public String workOrderjs() {
      return "work-order-list.js";
    }
	
	@GetMapping("/work-order-list.css")
    public String workOrderCss() {
      return "work-order-list.css";
    }

}
