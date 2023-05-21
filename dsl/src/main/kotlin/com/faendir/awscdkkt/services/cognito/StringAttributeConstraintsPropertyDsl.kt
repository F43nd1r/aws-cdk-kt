package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun stringAttributeConstraintsProperty(initializer: CfnUserPool.StringAttributeConstraintsProperty.Builder.() -> Unit
    = {}): CfnUserPool.StringAttributeConstraintsProperty =
    CfnUserPool.StringAttributeConstraintsProperty.builder().apply(initializer).build()
