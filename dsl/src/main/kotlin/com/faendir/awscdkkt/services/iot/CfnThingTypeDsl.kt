@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingType
import software.amazon.awscdk.services.iot.CfnThingTypeProps
import software.constructs.Construct

public fun Construct.cfnThingType(id: String, initializer: CfnThingType.() -> Unit = {}):
    CfnThingType = CfnThingType(this, id).apply(initializer)

public fun Construct.cfnThingType(
  id: String,
  props: CfnThingTypeProps,
  initializer: CfnThingType.() -> Unit = {},
): CfnThingType = CfnThingType(this, id, props).apply(initializer)
