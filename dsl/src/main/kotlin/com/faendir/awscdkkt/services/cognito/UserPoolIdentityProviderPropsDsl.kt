package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps

@Generated
public
    fun userPoolIdentityProviderProps(initializer: UserPoolIdentityProviderProps.Builder.() -> Unit
    = {}): UserPoolIdentityProviderProps =
    UserPoolIdentityProviderProps.builder().apply(initializer).build()
