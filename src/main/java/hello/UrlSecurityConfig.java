package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .httpBasic().and()
        .authorizeRequests()
        .antMatchers(HttpMethod.GET, "/api/people").hasRole("USER")
		.antMatchers(HttpMethod.GET, "/api/project").hasRole("USER")
		.antMatchers(HttpMethod.POST, "/api/people").hasRole("ADMIN")
		.antMatchers(HttpMethod.POST, "/api/project").hasRole("ADMIN")
		.antMatchers(HttpMethod.PUT, "/api/people").hasRole("ADMIN")
		.antMatchers(HttpMethod.PUT, "/api/project").hasRole("ADMIN")
		.antMatchers(HttpMethod.DELETE, "/api/people").hasRole("USER")
		.antMatchers(HttpMethod.DELETE, "/api/project").hasRole("ADMIN").and()
        .csrf().disable();
    }
}