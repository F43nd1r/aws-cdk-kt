@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.RollingUpdateOptions

public fun rollingUpdateOptions(initializer: RollingUpdateOptions.Builder.() -> Unit):
    RollingUpdateOptions = RollingUpdateOptions.builder().apply(initializer).build()
