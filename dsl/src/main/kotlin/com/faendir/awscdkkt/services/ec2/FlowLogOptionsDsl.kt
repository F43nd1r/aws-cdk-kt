package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.FlowLogOptions

@Generated
public fun flowLogOptions(initializer: FlowLogOptions.Builder.() -> Unit = {}): FlowLogOptions =
    FlowLogOptions.builder().apply(initializer).build()
