package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun instanceNetworkInterfaceSpecificationProperty(initializer: CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty =
    CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.builder().apply(initializer).build()
