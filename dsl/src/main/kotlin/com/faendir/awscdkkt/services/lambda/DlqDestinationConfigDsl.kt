@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DlqDestinationConfig

public fun dlqDestinationConfig(initializer: DlqDestinationConfig.Builder.() -> Unit):
    DlqDestinationConfig = DlqDestinationConfig.builder().apply(initializer).build()
