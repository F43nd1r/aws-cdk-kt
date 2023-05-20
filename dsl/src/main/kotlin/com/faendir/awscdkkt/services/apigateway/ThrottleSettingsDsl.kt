@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ThrottleSettings

public fun throttleSettings(initializer: ThrottleSettings.Builder.() -> Unit): ThrottleSettings =
    ThrottleSettings.builder().apply(initializer).build()
