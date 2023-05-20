@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.LogOptions

public fun logOptions(initializer: LogOptions.Builder.() -> Unit): LogOptions =
    LogOptions.builder().apply(initializer).build()
