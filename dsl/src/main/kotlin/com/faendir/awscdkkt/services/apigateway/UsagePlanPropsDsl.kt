package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.UsagePlanProps

@Generated
public fun usagePlanProps(initializer: UsagePlanProps.Builder.() -> Unit = {}): UsagePlanProps =
    UsagePlanProps.builder().apply(initializer).build()
