package com.faendir.awscdkkt.generated.services.location

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnRouteCalculator.() -> Unit = {},
): CfnRouteCalculator = CfnRouteCalculator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouteCalculator(id: String, initializer: @AwsCdkDsl
    CfnRouteCalculator.Builder.() -> Unit = {}): CfnRouteCalculator =
    CfnRouteCalculator.Builder.create(this, id).apply(initializer).build()
