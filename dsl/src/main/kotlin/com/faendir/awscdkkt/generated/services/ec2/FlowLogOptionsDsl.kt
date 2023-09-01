package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.FlowLogOptions

@Generated
public fun buildFlowLogOptions(initializer: @AwsCdkDsl FlowLogOptions.Builder.() -> Unit = {}):
    FlowLogOptions = FlowLogOptions.Builder().apply(initializer).build()
