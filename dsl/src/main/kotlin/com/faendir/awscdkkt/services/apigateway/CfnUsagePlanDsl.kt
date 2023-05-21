package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUsagePlan(id: String, initializer: CfnUsagePlan.() -> Unit = {}):
    CfnUsagePlan = CfnUsagePlan(this, id).apply(initializer)

@Generated
public fun Construct.cfnUsagePlan(
  id: String,
  props: CfnUsagePlanProps,
  initializer: CfnUsagePlan.() -> Unit = {},
): CfnUsagePlan = CfnUsagePlan(this, id, props).apply(initializer)
