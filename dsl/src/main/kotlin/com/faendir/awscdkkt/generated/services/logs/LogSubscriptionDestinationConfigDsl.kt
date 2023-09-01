package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig

@Generated
public fun buildLogSubscriptionDestinationConfig(initializer: @AwsCdkDsl
    LogSubscriptionDestinationConfig.Builder.() -> Unit = {}): LogSubscriptionDestinationConfig =
    LogSubscriptionDestinationConfig.Builder().apply(initializer).build()
