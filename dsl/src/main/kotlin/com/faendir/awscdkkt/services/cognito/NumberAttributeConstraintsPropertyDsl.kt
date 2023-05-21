package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun numberAttributeConstraintsProperty(initializer: CfnUserPool.NumberAttributeConstraintsProperty.Builder.() -> Unit
    = {}): CfnUserPool.NumberAttributeConstraintsProperty =
    CfnUserPool.NumberAttributeConstraintsProperty.builder().apply(initializer).build()
