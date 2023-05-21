package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun usernameConfigurationProperty(initializer: CfnUserPool.UsernameConfigurationProperty.Builder.() -> Unit
    = {}): CfnUserPool.UsernameConfigurationProperty =
    CfnUserPool.UsernameConfigurationProperty.builder().apply(initializer).build()
