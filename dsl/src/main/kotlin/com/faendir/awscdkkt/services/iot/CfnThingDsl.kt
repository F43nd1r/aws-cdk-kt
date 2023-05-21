package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThing(id: String, initializer: CfnThing.() -> Unit = {}): CfnThing =
    CfnThing(this, id).apply(initializer)

@Generated
public fun Construct.cfnThing(
  id: String,
  props: CfnThingProps,
  initializer: CfnThing.() -> Unit = {},
): CfnThing = CfnThing(this, id, props).apply(initializer)
