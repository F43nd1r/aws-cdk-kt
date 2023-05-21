package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DlqDestinationConfig

@Generated
public fun dlqDestinationConfig(initializer: DlqDestinationConfig.Builder.() -> Unit = {}):
    DlqDestinationConfig = DlqDestinationConfig.builder().apply(initializer).build()
