package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps

@Generated
public
    fun userPoolIdentityProviderAmazonProps(initializer: UserPoolIdentityProviderAmazonProps.Builder.() -> Unit
    = {}): UserPoolIdentityProviderAmazonProps =
    UserPoolIdentityProviderAmazonProps.builder().apply(initializer).build()
