package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps

@Generated
public fun cfnVPCEndpointServiceProps(initializer: CfnVPCEndpointServiceProps.Builder.() -> Unit =
    {}): CfnVPCEndpointServiceProps =
    CfnVPCEndpointServiceProps.builder().apply(initializer).build()
