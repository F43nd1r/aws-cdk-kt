@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

public
    fun dynamicSsmParameterProperty(initializer: CfnResponsePlan.DynamicSsmParameterProperty.Builder.() -> Unit):
    CfnResponsePlan.DynamicSsmParameterProperty =
    CfnResponsePlan.DynamicSsmParameterProperty.builder().apply(initializer).build()
