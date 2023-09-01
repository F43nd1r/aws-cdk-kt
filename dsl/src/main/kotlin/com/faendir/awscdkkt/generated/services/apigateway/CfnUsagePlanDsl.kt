package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUsagePlan(id: String, initializer: @AwsCdkDsl CfnUsagePlan.() -> Unit = {}):
    CfnUsagePlan = CfnUsagePlan(this, id).apply(initializer)

@Generated
public fun Construct.cfnUsagePlan(
  id: String,
  props: CfnUsagePlanProps,
  initializer: @AwsCdkDsl CfnUsagePlan.() -> Unit = {},
): CfnUsagePlan = CfnUsagePlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUsagePlan(id: String, initializer: @AwsCdkDsl
    CfnUsagePlan.Builder.() -> Unit = {}): CfnUsagePlan = CfnUsagePlan.Builder.create(this,
    id).apply(initializer).build()
