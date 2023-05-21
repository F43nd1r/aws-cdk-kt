package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun capacityReservationTargetProperty(initializer: CfnLaunchTemplate.CapacityReservationTargetProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.CapacityReservationTargetProperty =
    CfnLaunchTemplate.CapacityReservationTargetProperty.builder().apply(initializer).build()
