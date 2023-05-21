package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun classicLoadBalancerProperty(initializer: CfnSpotFleet.ClassicLoadBalancerProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.ClassicLoadBalancerProperty =
    CfnSpotFleet.ClassicLoadBalancerProperty.builder().apply(initializer).build()
