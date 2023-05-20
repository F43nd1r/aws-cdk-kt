@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
import software.constructs.Construct

public fun Construct.cfnUsagePlan(id: String, initializer: CfnUsagePlan.() -> Unit = {}):
    CfnUsagePlan = CfnUsagePlan(this, id).apply(initializer)

public fun Construct.cfnUsagePlan(
  id: String,
  props: CfnUsagePlanProps,
  initializer: CfnUsagePlan.() -> Unit = {},
): CfnUsagePlan = CfnUsagePlan(this, id, props).apply(initializer)
