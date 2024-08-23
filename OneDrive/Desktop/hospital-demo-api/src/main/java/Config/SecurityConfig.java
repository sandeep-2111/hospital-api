package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	 http
         .authorizeRequests(authz -> authz
             .requestMatchers("/users/register", "/login").permitAll() // Allow access to register and login endpoints
             .anyRequest().authenticated() // Require authentication for all other endpoints
         )
         .formLogin(login -> login
             .loginPage("/login") // Specify custom login page (if applicable)
             .permitAll() // Allow everyone to see the login page
         )
         .logout(logout -> logout
             .permitAll() // Allow everyone to access the logout functionality
         )
         .csrf(csrf -> csrf.disable()); // Disable CSRF protection for simplicity (enable it in production)

     return http.build();
        }
    }