package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun customSMSSenderProperty(initializer: CfnUserPool.CustomSMSSenderProperty.Builder.() -> Unit
    = {}): CfnUserPool.CustomSMSSenderProperty =
    CfnUserPool.CustomSMSSenderProperty.builder().apply(initializer).build()
