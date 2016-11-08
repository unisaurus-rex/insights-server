package com.vantiv.insights.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Enable logging on all request calls
 *
 * TODO: enable some filesystem, Splunk?, logging mechanisms instead of std console logging
 * TODO: create a core "logger" and use here
 */
public class LoggingInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        System.out.println(req.getMethod());    // request method
        System.out.println(req.getRequestURI());    // requested uri
        System.out.println(req.getSession().getId());   // sessionid
        System.out.println(req.getHeader("Authorization"));  // get specific header

        // Some session exploration
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("SessionMessage", "sessionString"); // set attributes in the session

        req.setAttribute("specialAttr", "specialValue");    // add something to the request context
        System.out.println("Pre-request handling logging.");    // bs
        return true;
    }

    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndView) {
        System.out.println(req.getAttribute("specialAttr"));
        System.out.println("Post-request handling logging.");
    }

    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex) throws Exception {
        System.out.println("Request completed.");
    }
}
