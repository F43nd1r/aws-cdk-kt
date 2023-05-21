package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ThrottlingPerMethod

@Generated
public fun throttlingPerMethod(initializer: ThrottlingPerMethod.Builder.() -> Unit = {}):
    ThrottlingPerMethod = ThrottlingPerMethod.builder().apply(initializer).build()
