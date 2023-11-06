package com.poc.auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("api/admin-only")
    @PreAuthorize("hasRole('admin')")
    public String adminOnlyEndpoint() {
        return "This endpoint is only accessible to users with the 'admin' role";
    }

}
