@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun instanceIpv6AddressProperty(initializer: CfnSpotFleet.InstanceIpv6AddressProperty.Builder.() -> Unit):
    CfnSpotFleet.InstanceIpv6AddressProperty =
    CfnSpotFleet.InstanceIpv6AddressProperty.builder().apply(initializer).build()
