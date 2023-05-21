package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public
    fun dynamicSsmParameterProperty(initializer: CfnResponsePlan.DynamicSsmParameterProperty.Builder.() -> Unit
    = {}): CfnResponsePlan.DynamicSsmParameterProperty =
    CfnResponsePlan.DynamicSsmParameterProperty.builder().apply(initializer).build()
