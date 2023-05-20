@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotfleetwise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnVehicle
import software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps
import software.constructs.Construct

public fun Construct.cfnVehicle(
  id: String,
  props: CfnVehicleProps,
  initializer: CfnVehicle.() -> Unit = {},
): CfnVehicle = CfnVehicle(this, id, props).apply(initializer)
