@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.RollingUpdateOptions

public fun rollingUpdateOptions(initializer: RollingUpdateOptions.Builder.() -> Unit):
    RollingUpdateOptions = RollingUpdateOptions.builder().apply(initializer).build()
