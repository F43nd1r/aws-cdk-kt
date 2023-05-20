@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ThrottlingPerMethod

public fun throttlingPerMethod(initializer: ThrottlingPerMethod.Builder.() -> Unit):
    ThrottlingPerMethod = ThrottlingPerMethod.builder().apply(initializer).build()
