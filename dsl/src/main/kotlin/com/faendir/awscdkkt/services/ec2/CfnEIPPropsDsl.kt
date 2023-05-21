package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIPProps

@Generated
public fun cfnEIPProps(initializer: CfnEIPProps.Builder.() -> Unit = {}): CfnEIPProps =
    CfnEIPProps.builder().apply(initializer).build()
