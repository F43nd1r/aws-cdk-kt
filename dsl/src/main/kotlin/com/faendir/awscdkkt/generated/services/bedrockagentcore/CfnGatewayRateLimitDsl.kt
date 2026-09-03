package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnGatewayRateLimit
import software.amazon.awscdk.services.bedrockagentcore.CfnGatewayRateLimitProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGatewayRateLimit(
  id: String,
  props: CfnGatewayRateLimitProps,
  initializer: @AwsCdkDsl CfnGatewayRateLimit.() -> Unit = {},
): CfnGatewayRateLimit = CfnGatewayRateLimit(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGatewayRateLimit(id: String, initializer: @AwsCdkDsl CfnGatewayRateLimit.Builder.() -> Unit = {}): CfnGatewayRateLimit = CfnGatewayRateLimit.Builder.create(this, id).apply(initializer).build()
