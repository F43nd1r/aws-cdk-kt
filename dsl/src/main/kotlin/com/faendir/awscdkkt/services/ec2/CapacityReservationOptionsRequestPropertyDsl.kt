package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@Generated
public
    fun capacityReservationOptionsRequestProperty(initializer: CfnEC2Fleet.CapacityReservationOptionsRequestProperty.Builder.() -> Unit
    = {}): CfnEC2Fleet.CapacityReservationOptionsRequestProperty =
    CfnEC2Fleet.CapacityReservationOptionsRequestProperty.builder().apply(initializer).build()
