package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUsagePlanKey(
  id: String,
  props: CfnUsagePlanKeyProps,
  initializer: CfnUsagePlanKey.() -> Unit = {},
): CfnUsagePlanKey = CfnUsagePlanKey(this, id, props).apply(initializer)
