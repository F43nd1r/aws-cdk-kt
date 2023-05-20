@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps

public
    fun userPoolIdentityProviderProps(initializer: UserPoolIdentityProviderProps.Builder.() -> Unit):
    UserPoolIdentityProviderProps =
    UserPoolIdentityProviderProps.builder().apply(initializer).build()
