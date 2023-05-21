package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps

@Generated
public fun cfnVPCPeeringConnectionProps(initializer: CfnVPCPeeringConnectionProps.Builder.() -> Unit
    = {}): CfnVPCPeeringConnectionProps =
    CfnVPCPeeringConnectionProps.builder().apply(initializer).build()
