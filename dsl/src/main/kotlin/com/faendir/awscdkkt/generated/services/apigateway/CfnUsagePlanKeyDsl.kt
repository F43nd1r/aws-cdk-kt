package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUsagePlanKey(id: String, props: CfnUsagePlanKeyProps): CfnUsagePlanKey =
    CfnUsagePlanKey(this, id, props)

@Generated
public fun Construct.cfnUsagePlanKey(
  id: String,
  props: CfnUsagePlanKeyProps,
  initializer: @AwsCdkDsl CfnUsagePlanKey.() -> Unit,
): CfnUsagePlanKey = CfnUsagePlanKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUsagePlanKey(id: String, initializer: @AwsCdkDsl
    CfnUsagePlanKey.Builder.() -> Unit): CfnUsagePlanKey = CfnUsagePlanKey.Builder.create(this,
    id).apply(initializer).build()
