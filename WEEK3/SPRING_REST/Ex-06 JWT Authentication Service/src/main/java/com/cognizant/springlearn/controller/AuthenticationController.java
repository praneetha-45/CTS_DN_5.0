package com.cognizant.springlearn.controller;


import java.util.Base64;

import java.util.Date;

import java.util.HashMap;

import java.util.Map;


import javax.crypto.spec.SecretKeySpec;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestHeader;

import org.springframework.web.bind.annotation.RestController;


import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.SignatureAlgorithm;



@RestController

public class AuthenticationController {



    private static final Logger LOGGER =

            LoggerFactory.getLogger(AuthenticationController.class);



    @GetMapping("/authenticate")

    public Map<String,String> authenticate(

            @RequestHeader("Authorization") String authHeader){



        LOGGER.info("START");



        String user = getUser(authHeader);



        String token = generateJwt(user);



        Map<String,String> map = new HashMap<>();


        map.put("token", token);



        LOGGER.info("END");



        return map;


    }





    private String getUser(String authHeader){



        String encodedCredentials =

                authHeader.substring(6);



        byte[] decoded =

                Base64.getDecoder()

                        .decode(encodedCredentials);



        String decodedString =

                new String(decoded);



        String user =

                decodedString.split(":")[0];



        return user;


    }






    private String generateJwt(String user){



        String secret = "secretkey";



        return Jwts.builder()


                .setSubject(user)


                .setIssuedAt(new Date())


                .setExpiration(

                        new Date(

                                System.currentTimeMillis()

                                        + 20 * 60 * 1000

                        )

                )


                .signWith(

                        SignatureAlgorithm.HS256,

                        secret

                )


                .compact();


    }


}