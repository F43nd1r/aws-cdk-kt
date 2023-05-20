@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingGroup
import software.amazon.awscdk.services.iot.CfnThingGroupProps
import software.constructs.Construct

public fun Construct.cfnThingGroup(id: String, initializer: CfnThingGroup.() -> Unit = {}):
    CfnThingGroup = CfnThingGroup(this, id).apply(initializer)

public fun Construct.cfnThingGroup(
  id: String,
  props: CfnThingGroupProps,
  initializer: CfnThingGroup.() -> Unit = {},
): CfnThingGroup = CfnThingGroup(this, id, props).apply(initializer)
