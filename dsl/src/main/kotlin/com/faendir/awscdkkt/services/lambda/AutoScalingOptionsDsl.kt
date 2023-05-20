@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AutoScalingOptions

public fun autoScalingOptions(initializer: AutoScalingOptions.Builder.() -> Unit):
    AutoScalingOptions = AutoScalingOptions.builder().apply(initializer).build()
