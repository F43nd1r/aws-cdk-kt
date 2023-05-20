@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnDimension
import software.amazon.awscdk.services.iot.CfnDimensionProps
import software.constructs.Construct

public fun Construct.cfnDimension(
  id: String,
  props: CfnDimensionProps,
  initializer: CfnDimension.() -> Unit = {},
): CfnDimension = CfnDimension(this, id, props).apply(initializer)
