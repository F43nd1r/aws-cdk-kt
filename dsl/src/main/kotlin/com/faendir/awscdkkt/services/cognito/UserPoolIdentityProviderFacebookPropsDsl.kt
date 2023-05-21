package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps

@Generated
public
    fun userPoolIdentityProviderFacebookProps(initializer: UserPoolIdentityProviderFacebookProps.Builder.() -> Unit
    = {}): UserPoolIdentityProviderFacebookProps =
    UserPoolIdentityProviderFacebookProps.builder().apply(initializer).build()
