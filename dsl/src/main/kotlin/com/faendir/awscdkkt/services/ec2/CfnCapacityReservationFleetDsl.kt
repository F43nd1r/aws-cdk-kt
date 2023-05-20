@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps
import software.constructs.Construct

public fun Construct.cfnCapacityReservationFleet(
  id: String,
  props: CfnCapacityReservationFleetProps,
  initializer: CfnCapacityReservationFleet.() -> Unit = {},
): CfnCapacityReservationFleet = CfnCapacityReservationFleet(this, id, props).apply(initializer)

public fun Construct.cfnCapacityReservationFleet(id: String,
    initializer: CfnCapacityReservationFleet.() -> Unit = {}): CfnCapacityReservationFleet =
    CfnCapacityReservationFleet(this, id).apply(initializer)
