package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun capacityReservationSpecificationProperty(initializer: CfnLaunchTemplate.CapacityReservationSpecificationProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.CapacityReservationSpecificationProperty =
    CfnLaunchTemplate.CapacityReservationSpecificationProperty.builder().apply(initializer).build()
