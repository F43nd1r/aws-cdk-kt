package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.apigateway.UsagePlanProps
import software.constructs.Construct

@Generated
public fun Construct.usagePlan(id: String, initializer: @AwsCdkDsl UsagePlan.() -> Unit = {}):
    UsagePlan = UsagePlan(this, id).apply(initializer)

@Generated
public fun Construct.usagePlan(
  id: String,
  props: UsagePlanProps,
  initializer: @AwsCdkDsl UsagePlan.() -> Unit = {},
): UsagePlan = UsagePlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUsagePlan(id: String, initializer: @AwsCdkDsl UsagePlan.Builder.() -> Unit
    = {}): UsagePlan = UsagePlan.Builder.create(this, id).apply(initializer).build()
