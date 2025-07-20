package com.faendir.awscdkkt.generated.services.athena

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.amazon.awscdk.services.athena.CfnCapacityReservationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCapacityReservation(
  id: String,
  props: CfnCapacityReservationProps,
  initializer: @AwsCdkDsl CfnCapacityReservation.() -> Unit = {},
): CfnCapacityReservation = CfnCapacityReservation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCapacityReservation(id: String, initializer: @AwsCdkDsl CfnCapacityReservation.Builder.() -> Unit = {}): CfnCapacityReservation = CfnCapacityReservation.Builder.create(this, id).apply(initializer).build()
