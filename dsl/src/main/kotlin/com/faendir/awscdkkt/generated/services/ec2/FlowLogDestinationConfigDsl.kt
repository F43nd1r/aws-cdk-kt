package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.FlowLogDestinationConfig

@Generated
public fun buildFlowLogDestinationConfig(initializer: @AwsCdkDsl
    FlowLogDestinationConfig.Builder.() -> Unit): FlowLogDestinationConfig =
    FlowLogDestinationConfig.Builder().apply(initializer).build()
