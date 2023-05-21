package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun userPoolAddOnsProperty(initializer: CfnUserPool.UserPoolAddOnsProperty.Builder.() -> Unit
    = {}): CfnUserPool.UserPoolAddOnsProperty =
    CfnUserPool.UserPoolAddOnsProperty.builder().apply(initializer).build()
