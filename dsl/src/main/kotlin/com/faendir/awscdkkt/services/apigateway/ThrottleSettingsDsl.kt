@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ThrottleSettings

public fun throttleSettings(initializer: ThrottleSettings.Builder.() -> Unit): ThrottleSettings =
    ThrottleSettings.builder().apply(initializer).build()
