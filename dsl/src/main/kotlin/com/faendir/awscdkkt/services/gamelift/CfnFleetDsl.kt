@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnFleet
import software.amazon.awscdk.services.gamelift.CfnFleetProps
import software.constructs.Construct

public fun Construct.cfnFleet(
  id: String,
  props: CfnFleetProps,
  initializer: CfnFleet.() -> Unit = {},
): CfnFleet = CfnFleet(this, id, props).apply(initializer)
