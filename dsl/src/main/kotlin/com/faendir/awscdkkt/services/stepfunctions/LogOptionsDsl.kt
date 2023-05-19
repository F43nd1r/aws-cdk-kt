@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.LogOptions

public fun logOptions(initializer: LogOptions.Builder.() -> Unit): LogOptions =
    LogOptions.builder().apply(initializer).build()
