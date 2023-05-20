@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnRouteCalculator
import software.amazon.awscdk.services.location.CfnRouteCalculatorProps
import software.constructs.Construct

public fun Construct.cfnRouteCalculator(
  id: String,
  props: CfnRouteCalculatorProps,
  initializer: CfnRouteCalculator.() -> Unit = {},
): CfnRouteCalculator = CfnRouteCalculator(this, id, props).apply(initializer)
