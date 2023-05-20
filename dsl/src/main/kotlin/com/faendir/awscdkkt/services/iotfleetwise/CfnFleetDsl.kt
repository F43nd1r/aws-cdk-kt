@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotfleetwise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnFleet
import software.amazon.awscdk.services.iotfleetwise.CfnFleetProps
import software.constructs.Construct

public fun Construct.cfnFleet(
  id: String,
  props: CfnFleetProps,
  initializer: CfnFleet.() -> Unit = {},
): CfnFleet = CfnFleet(this, id, props).apply(initializer)
