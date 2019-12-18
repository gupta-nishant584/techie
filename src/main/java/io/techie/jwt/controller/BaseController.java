package io.techie.jwt.controller;

import io.techie.jwt.model.AuthenticationRequest;
import io.techie.jwt.model.AuthenticationResponse;
import io.techie.jwt.security.MyUserDetailsService;
import io.techie.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

        @Autowired
        private AuthenticationManager authenticationManager;

        @Autowired
        private JwtUtil jwtUtil;

        @Autowired
        private MyUserDetailsService myUserDetailsService;

        @RequestMapping(value="/hello", produces = MediaType.TEXT_HTML_VALUE)
        public String helloMessage(){
                return "<h1>hello</h1>";
        }

        @RequestMapping(value="/authenticate",method = RequestMethod.POST)
        public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
                // This try/catch code works for authenticating request as we are permitting all user to access this endpoint.
                //Once authentication is done userDetailsService can be used to return the UserDetails object and then UserDetails object
                // is used to generate token.
                try {
                        authenticationManager.authenticate(
                                new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
                        );
                }catch (BadCredentialsException e){
                        throw new Exception("Incorrect username and password",e);
                }

                final UserDetails userDetails = myUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
                final String jwt = jwtUtil.generateToken(userDetails);

                return ResponseEntity.ok(new AuthenticationResponse(jwt));
        }
}


