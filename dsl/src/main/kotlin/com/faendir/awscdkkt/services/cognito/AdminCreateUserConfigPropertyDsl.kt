package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun adminCreateUserConfigProperty(initializer: CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit
    = {}): CfnUserPool.AdminCreateUserConfigProperty =
    CfnUserPool.AdminCreateUserConfigProperty.builder().apply(initializer).build()
