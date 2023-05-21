package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCapacityReservation
import software.amazon.awscdk.services.ec2.CfnCapacityReservationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCapacityReservation(
  id: String,
  props: CfnCapacityReservationProps,
  initializer: CfnCapacityReservation.() -> Unit = {},
): CfnCapacityReservation = CfnCapacityReservation(this, id, props).apply(initializer)
