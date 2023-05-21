package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig

@Generated
public
    fun logSubscriptionDestinationConfig(initializer: LogSubscriptionDestinationConfig.Builder.() -> Unit
    = {}): LogSubscriptionDestinationConfig =
    LogSubscriptionDestinationConfig.builder().apply(initializer).build()
