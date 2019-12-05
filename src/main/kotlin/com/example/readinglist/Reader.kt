package com.example.readinglist

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.util.*

class Reader: UserDetails {
    companion object {
        val serialVersionUID: Long = 1L
    }

    constructor (
            username: String,
            fullname: String,
            password: String
    ) {
        this.username = username
        this.fullname = fullname
        this.password = password
    }

    private var username: String
    private var fullname: String
    private var password: String

    override fun getPassword(): String {
        return password
    }

    fun getFullname(): String {
        return fullname
    }

    override fun getUsername(): String {
        return username
    }

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return Arrays.asList(SimpleGrantedAuthority("ROLE_READER"))
    }

    override fun isAccountNonExpired(): Boolean {
        return true;
    }

    override fun isAccountNonLocked(): Boolean {
        return true;
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true;
    }

    override fun isEnabled(): Boolean {
        return true;
    }
}