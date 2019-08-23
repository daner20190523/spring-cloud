//package com.zdd.movie.feign.consumer.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
//@Configuration
//public class OAuthConfiguration extends ResourceServerConfigurerAdapter {
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.resourceId("WRIGTH").tokenStore(jwtTokenStore());
//    }
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/**").authenticated()
//                .antMatchers(HttpMethod.GET,"/movie/test")
//                .hasAuthority("WRIGTH_READ");
//    }
//
//    @Bean
//    public TokenStore jwtTokenStore(){
//        return new JwtTokenStore(jwtTokenConverter());
//    }
//    @Bean
//    protected JwtAccessTokenConverter jwtTokenConverter(){
//        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
//        jwtAccessTokenConverter.setSigningKey("springcloud");
//        return jwtAccessTokenConverter;
//    }
//}
