package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun baselineEbsBandwidthMbpsRequestProperty(initializer: CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty =
    CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.builder().apply(initializer).build()
