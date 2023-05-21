package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps

@Generated
public
    fun userPoolIdentityProviderOidcProps(initializer: UserPoolIdentityProviderOidcProps.Builder.() -> Unit
    = {}): UserPoolIdentityProviderOidcProps =
    UserPoolIdentityProviderOidcProps.builder().apply(initializer).build()
