package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@Generated
public
    fun capacityRebalanceProperty(initializer: CfnEC2Fleet.CapacityRebalanceProperty.Builder.() -> Unit
    = {}): CfnEC2Fleet.CapacityRebalanceProperty =
    CfnEC2Fleet.CapacityRebalanceProperty.builder().apply(initializer).build()
