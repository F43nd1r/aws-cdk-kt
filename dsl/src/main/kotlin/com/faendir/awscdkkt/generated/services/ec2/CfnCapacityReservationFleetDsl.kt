package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCapacityReservationFleet(id: String): CfnCapacityReservationFleet =
    CfnCapacityReservationFleet(this, id)

@Generated
public fun Construct.cfnCapacityReservationFleet(id: String, initializer: @AwsCdkDsl
    CfnCapacityReservationFleet.() -> Unit): CfnCapacityReservationFleet =
    CfnCapacityReservationFleet(this, id).apply(initializer)

@Generated
public fun Construct.cfnCapacityReservationFleet(id: String,
    props: CfnCapacityReservationFleetProps): CfnCapacityReservationFleet =
    CfnCapacityReservationFleet(this, id, props)

@Generated
public fun Construct.cfnCapacityReservationFleet(
  id: String,
  props: CfnCapacityReservationFleetProps,
  initializer: @AwsCdkDsl CfnCapacityReservationFleet.() -> Unit,
): CfnCapacityReservationFleet = CfnCapacityReservationFleet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCapacityReservationFleet(id: String, initializer: @AwsCdkDsl
    CfnCapacityReservationFleet.Builder.() -> Unit): CfnCapacityReservationFleet =
    CfnCapacityReservationFleet.Builder.create(this, id).apply(initializer).build()
