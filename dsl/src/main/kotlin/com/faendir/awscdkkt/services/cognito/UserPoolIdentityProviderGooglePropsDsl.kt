package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps

@Generated
public
    fun userPoolIdentityProviderGoogleProps(initializer: UserPoolIdentityProviderGoogleProps.Builder.() -> Unit
    = {}): UserPoolIdentityProviderGoogleProps =
    UserPoolIdentityProviderGoogleProps.builder().apply(initializer).build()
