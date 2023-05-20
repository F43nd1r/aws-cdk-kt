@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnFleet
import software.amazon.awscdk.services.robomaker.CfnFleetProps
import software.constructs.Construct

public fun Construct.cfnFleet(
  id: String,
  props: CfnFleetProps,
  initializer: CfnFleet.() -> Unit = {},
): CfnFleet = CfnFleet(this, id, props).apply(initializer)

public fun Construct.cfnFleet(id: String, initializer: CfnFleet.() -> Unit = {}): CfnFleet =
    CfnFleet(this, id).apply(initializer)
