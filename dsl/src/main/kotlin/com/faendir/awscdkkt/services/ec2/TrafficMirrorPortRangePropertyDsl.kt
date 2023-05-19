@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule

public
    fun trafficMirrorPortRangeProperty(initializer: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit):
    CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty =
    CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.builder().apply(initializer).build()
