package com.example.jwt.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 10/5/2021
 */

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AuthRequest {

    private String userName;
    private String password;

}
