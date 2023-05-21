package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun networkBandwidthGbpsProperty(initializer: CfnLaunchTemplate.NetworkBandwidthGbpsProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.NetworkBandwidthGbpsProperty =
    CfnLaunchTemplate.NetworkBandwidthGbpsProperty.builder().apply(initializer).build()
