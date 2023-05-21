package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps

@Generated
public
    fun userPoolIdentityProviderSamlProps(initializer: UserPoolIdentityProviderSamlProps.Builder.() -> Unit
    = {}): UserPoolIdentityProviderSamlProps =
    UserPoolIdentityProviderSamlProps.builder().apply(initializer).build()
