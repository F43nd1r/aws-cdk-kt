package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun loadBalancersConfigProperty(initializer: CfnSpotFleet.LoadBalancersConfigProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.LoadBalancersConfigProperty =
    CfnSpotFleet.LoadBalancersConfigProperty.builder().apply(initializer).build()
