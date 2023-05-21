package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet

@Generated
public
    fun instanceTypeSpecificationProperty(initializer: CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.Builder.() -> Unit
    = {}): CfnCapacityReservationFleet.InstanceTypeSpecificationProperty =
    CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.builder().apply(initializer).build()
