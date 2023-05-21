package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps

@Generated
public
    fun cfnVerifiedAccessEndpointProps(initializer: CfnVerifiedAccessEndpointProps.Builder.() -> Unit
    = {}): CfnVerifiedAccessEndpointProps =
    CfnVerifiedAccessEndpointProps.builder().apply(initializer).build()
