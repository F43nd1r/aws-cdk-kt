package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CustomAttributeConfig

@Generated
public fun customAttributeConfig(initializer: CustomAttributeConfig.Builder.() -> Unit = {}):
    CustomAttributeConfig = CustomAttributeConfig.builder().apply(initializer).build()
