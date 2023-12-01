package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.ThrottleSettings

@Generated
public fun buildThrottleSettings(initializer: @AwsCdkDsl ThrottleSettings.Builder.() -> Unit = {}):
    ThrottleSettings = ThrottleSettings.Builder().apply(initializer).build()
