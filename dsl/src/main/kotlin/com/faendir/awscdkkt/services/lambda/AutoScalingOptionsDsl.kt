package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AutoScalingOptions

@Generated
public fun autoScalingOptions(initializer: AutoScalingOptions.Builder.() -> Unit = {}):
    AutoScalingOptions = AutoScalingOptions.builder().apply(initializer).build()
