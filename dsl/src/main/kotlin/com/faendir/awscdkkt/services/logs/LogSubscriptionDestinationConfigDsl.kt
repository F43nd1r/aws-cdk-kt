@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig

public
    fun logSubscriptionDestinationConfig(initializer: LogSubscriptionDestinationConfig.Builder.() -> Unit):
    LogSubscriptionDestinationConfig =
    LogSubscriptionDestinationConfig.builder().apply(initializer).build()
