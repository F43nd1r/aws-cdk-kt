package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnFlowLogProps

@Generated
public fun cfnFlowLogProps(initializer: CfnFlowLogProps.Builder.() -> Unit = {}): CfnFlowLogProps =
    CfnFlowLogProps.builder().apply(initializer).build()
