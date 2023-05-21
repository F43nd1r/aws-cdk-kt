package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun networkBandwidthGbpsRequestProperty(initializer: CfnSpotFleet.NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.NetworkBandwidthGbpsRequestProperty =
    CfnSpotFleet.NetworkBandwidthGbpsRequestProperty.builder().apply(initializer).build()
