package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

@Generated
public
    fun networkInterfaceProperty(initializer: CfnEndpoint.NetworkInterfaceProperty.Builder.() -> Unit
    = {}): CfnEndpoint.NetworkInterfaceProperty =
    CfnEndpoint.NetworkInterfaceProperty.builder().apply(initializer).build()
