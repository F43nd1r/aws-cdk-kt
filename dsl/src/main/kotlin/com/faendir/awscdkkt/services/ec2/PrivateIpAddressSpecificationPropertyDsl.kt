package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun privateIpAddressSpecificationProperty(initializer: CfnSpotFleet.PrivateIpAddressSpecificationProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.PrivateIpAddressSpecificationProperty =
    CfnSpotFleet.PrivateIpAddressSpecificationProperty.builder().apply(initializer).build()
