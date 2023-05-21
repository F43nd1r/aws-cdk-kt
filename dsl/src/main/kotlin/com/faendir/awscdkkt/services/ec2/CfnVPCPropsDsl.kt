package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCProps

@Generated
public fun cfnVPCProps(initializer: CfnVPCProps.Builder.() -> Unit = {}): CfnVPCProps =
    CfnVPCProps.builder().apply(initializer).build()
