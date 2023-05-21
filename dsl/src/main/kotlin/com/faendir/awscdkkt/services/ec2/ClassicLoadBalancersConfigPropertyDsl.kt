package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun classicLoadBalancersConfigProperty(initializer: CfnSpotFleet.ClassicLoadBalancersConfigProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.ClassicLoadBalancersConfigProperty =
    CfnSpotFleet.ClassicLoadBalancersConfigProperty.builder().apply(initializer).build()
