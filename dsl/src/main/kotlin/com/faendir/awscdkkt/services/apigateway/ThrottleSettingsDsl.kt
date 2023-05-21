package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ThrottleSettings

@Generated
public fun throttleSettings(initializer: ThrottleSettings.Builder.() -> Unit = {}): ThrottleSettings
    = ThrottleSettings.builder().apply(initializer).build()
