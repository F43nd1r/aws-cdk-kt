package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnRouteCalculator
import software.amazon.awscdk.services.location.CfnRouteCalculatorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouteCalculator(
  id: String,
  props: CfnRouteCalculatorProps,
  initializer: CfnRouteCalculator.() -> Unit = {},
): CfnRouteCalculator = CfnRouteCalculator(this, id, props).apply(initializer)
