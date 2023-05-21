package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.FlowLogDestinationConfig

@Generated
public fun flowLogDestinationConfig(initializer: FlowLogDestinationConfig.Builder.() -> Unit = {}):
    FlowLogDestinationConfig = FlowLogDestinationConfig.builder().apply(initializer).build()
