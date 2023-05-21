package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnEndpointProps

@Generated
public fun cfnEndpointProps(initializer: CfnEndpointProps.Builder.() -> Unit = {}): CfnEndpointProps
    = CfnEndpointProps.builder().apply(initializer).build()
