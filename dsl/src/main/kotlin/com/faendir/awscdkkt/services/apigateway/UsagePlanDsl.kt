package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.apigateway.UsagePlanProps
import software.constructs.Construct

@Generated
public fun Construct.usagePlan(id: String, initializer: UsagePlan.() -> Unit = {}): UsagePlan =
    UsagePlan(this, id).apply(initializer)

@Generated
public fun Construct.usagePlan(
  id: String,
  props: UsagePlanProps,
  initializer: UsagePlan.() -> Unit = {},
): UsagePlan = UsagePlan(this, id, props).apply(initializer)
