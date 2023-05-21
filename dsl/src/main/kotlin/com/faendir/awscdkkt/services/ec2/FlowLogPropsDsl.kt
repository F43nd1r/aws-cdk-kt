package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.FlowLogProps

@Generated
public fun flowLogProps(initializer: FlowLogProps.Builder.() -> Unit = {}): FlowLogProps =
    FlowLogProps.builder().apply(initializer).build()
