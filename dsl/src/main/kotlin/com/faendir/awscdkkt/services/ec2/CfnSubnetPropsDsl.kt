package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnetProps

@Generated
public fun cfnSubnetProps(initializer: CfnSubnetProps.Builder.() -> Unit = {}): CfnSubnetProps =
    CfnSubnetProps.builder().apply(initializer).build()
