package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnGatewayRule
import software.amazon.awscdk.services.bedrockagentcore.CfnGatewayRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGatewayRule(
  id: String,
  props: CfnGatewayRuleProps,
  initializer: @AwsCdkDsl CfnGatewayRule.() -> Unit = {},
): CfnGatewayRule = CfnGatewayRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGatewayRule(id: String, initializer: @AwsCdkDsl CfnGatewayRule.Builder.() -> Unit = {}): CfnGatewayRule = CfnGatewayRule.Builder.create(this, id).apply(initializer).build()
