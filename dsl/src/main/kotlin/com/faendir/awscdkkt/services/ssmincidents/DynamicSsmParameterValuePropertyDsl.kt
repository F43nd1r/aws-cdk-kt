package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public
    fun dynamicSsmParameterValueProperty(initializer: CfnResponsePlan.DynamicSsmParameterValueProperty.Builder.() -> Unit
    = {}): CfnResponsePlan.DynamicSsmParameterValueProperty =
    CfnResponsePlan.DynamicSsmParameterValueProperty.builder().apply(initializer).build()
