@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingProps
import software.constructs.Construct

public fun Construct.cfnThing(id: String, initializer: CfnThing.() -> Unit = {}): CfnThing =
    CfnThing(this, id).apply(initializer)

public fun Construct.cfnThing(
  id: String,
  props: CfnThingProps,
  initializer: CfnThing.() -> Unit = {},
): CfnThing = CfnThing(this, id, props).apply(initializer)
