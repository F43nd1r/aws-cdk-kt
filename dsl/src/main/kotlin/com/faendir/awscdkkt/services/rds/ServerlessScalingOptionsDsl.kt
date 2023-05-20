@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessScalingOptions

public fun serverlessScalingOptions(initializer: ServerlessScalingOptions.Builder.() -> Unit):
    ServerlessScalingOptions = ServerlessScalingOptions.builder().apply(initializer).build()
