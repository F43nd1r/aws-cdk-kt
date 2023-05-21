package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun emailConfigurationProperty(initializer: CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit
    = {}): CfnUserPool.EmailConfigurationProperty =
    CfnUserPool.EmailConfigurationProperty.builder().apply(initializer).build()
