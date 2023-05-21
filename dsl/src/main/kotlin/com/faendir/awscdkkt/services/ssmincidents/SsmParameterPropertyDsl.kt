package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public fun ssmParameterProperty(initializer: CfnResponsePlan.SsmParameterProperty.Builder.() -> Unit
    = {}): CfnResponsePlan.SsmParameterProperty =
    CfnResponsePlan.SsmParameterProperty.builder().apply(initializer).build()
