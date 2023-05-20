@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingProps
import software.constructs.Construct

public fun Construct.cfnThing(
  id: String,
  props: CfnThingProps,
  initializer: CfnThing.() -> Unit = {},
): CfnThing = CfnThing(this, id, props).apply(initializer)

public fun Construct.cfnThing(id: String, initializer: CfnThing.() -> Unit = {}): CfnThing =
    CfnThing(this, id).apply(initializer)
