@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.LogConfig

public fun logConfig(initializer: LogConfig.Builder.() -> Unit): LogConfig =
    LogConfig.builder().apply(initializer).build()
