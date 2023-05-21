package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps

@Generated
public
    fun cfnUserPoolResourceServerProps(initializer: CfnUserPoolResourceServerProps.Builder.() -> Unit
    = {}): CfnUserPoolResourceServerProps =
    CfnUserPoolResourceServerProps.builder().apply(initializer).build()
