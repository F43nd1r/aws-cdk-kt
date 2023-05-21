package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnDimension
import software.amazon.awscdk.services.iot.CfnDimensionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDimension(
  id: String,
  props: CfnDimensionProps,
  initializer: CfnDimension.() -> Unit = {},
): CfnDimension = CfnDimension(this, id, props).apply(initializer)
