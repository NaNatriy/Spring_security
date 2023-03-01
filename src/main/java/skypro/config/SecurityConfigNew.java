package skypro.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfigNew extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;

    public SecurityConfigNew(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication().dataSource(dataSource);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("EMPLOYEE", "IT", "STUFF", "DIRECTOR")
                .antMatchers("/it_info").hasAnyRole("IT", "DIRECTOR")
                .antMatchers("/stuff_info").hasAnyRole("STUFF", "DIRECTOR")
                .antMatchers("/director_info").hasAnyRole("DIRECTOR")
                .and().formLogin().permitAll();
    }
}

