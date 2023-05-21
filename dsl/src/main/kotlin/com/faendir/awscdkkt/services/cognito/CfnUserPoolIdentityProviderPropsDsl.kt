package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps

@Generated
public
    fun cfnUserPoolIdentityProviderProps(initializer: CfnUserPoolIdentityProviderProps.Builder.() -> Unit
    = {}): CfnUserPoolIdentityProviderProps =
    CfnUserPoolIdentityProviderProps.builder().apply(initializer).build()
