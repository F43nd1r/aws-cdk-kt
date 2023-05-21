package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule

@Generated
public
    fun trafficMirrorPortRangeProperty(initializer: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit
    = {}): CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty =
    CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.builder().apply(initializer).build()
