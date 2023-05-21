package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun instanceRequirementsRequestProperty(initializer: CfnSpotFleet.InstanceRequirementsRequestProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.InstanceRequirementsRequestProperty =
    CfnSpotFleet.InstanceRequirementsRequestProperty.builder().apply(initializer).build()
