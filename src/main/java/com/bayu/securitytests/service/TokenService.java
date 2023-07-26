package com.bayu.securitytests.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenService {

//    private final JwtEncoder encoder;

//    public String generateToken(Authentication authentication) {
//        Instant now = Instant.now();
//
//        String scope = authentication.getAuthorities().stream()
//                .map(GrantedAuthority::getAuthority)
//                .filter(authority -> !authority.startsWith("ROLE"))
//                .collect(Collectors.joining(" "));
//
//        System.out.println("Scope : " + scope); // READ
//
//        JwtClaimsSet claims = JwtClaimsSet.builder()
//                .issuer("self")
//                .issuedAt(now)
//                .expiresAt(now.plus(1, ChronoUnit.HOURS))
//                .subject(authentication.getName())
//                .claim("scope", scope)
//                .build();
//
//        JwtEncoderParameters encoderParameters = JwtEncoderParameters.from(JwsHeader.with(MacAlgorithm.HS512).build(), claims);
//
//        return this.encoder.encode(encoderParameters).getTokenValue();
//    }
}
