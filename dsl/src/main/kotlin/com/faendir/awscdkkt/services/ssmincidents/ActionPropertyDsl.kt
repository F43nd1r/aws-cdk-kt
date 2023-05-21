package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public fun actionProperty(initializer: CfnResponsePlan.ActionProperty.Builder.() -> Unit = {}):
    CfnResponsePlan.ActionProperty =
    CfnResponsePlan.ActionProperty.builder().apply(initializer).build()
