package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun customEmailSenderProperty(initializer: CfnUserPool.CustomEmailSenderProperty.Builder.() -> Unit
    = {}): CfnUserPool.CustomEmailSenderProperty =
    CfnUserPool.CustomEmailSenderProperty.builder().apply(initializer).build()
