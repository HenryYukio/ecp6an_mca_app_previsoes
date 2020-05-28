package br.usjt.hellospringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.usjt.hellospringboot.controller.LoginInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer {

@Override
public void addInterceptors(InterceptorRegistry registry) {
registry.addInterceptor(
new LoginInterceptor()).
addPathPatterns("/**").
excludePathPatterns("/login", "/", "/fazerLogin", "/webjars/**", "/bootstrap/**");
}
}