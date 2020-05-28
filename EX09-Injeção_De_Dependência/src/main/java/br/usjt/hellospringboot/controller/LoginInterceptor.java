package br.usjt.hellospringboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
@Override
public boolean preHandle(HttpServletRequest request,
HttpServletResponse response, Object handler)

throws Exception {
//pega a sessão
HttpSession session = request.getSession();
//se ainda não logou, manda para a página de login
if (session.getAttribute("usuarioLogado") == null)
response.sendRedirect("login");
//se já logou, deixa a requisição passar e chegar no controller;
	
return true;
}
}