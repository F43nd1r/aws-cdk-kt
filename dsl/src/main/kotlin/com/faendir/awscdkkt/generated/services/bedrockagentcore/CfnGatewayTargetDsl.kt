package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnGatewayTarget
import software.amazon.awscdk.services.bedrockagentcore.CfnGatewayTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGatewayTarget(
  id: String,
  props: CfnGatewayTargetProps,
  initializer: @AwsCdkDsl CfnGatewayTarget.() -> Unit = {},
): CfnGatewayTarget = CfnGatewayTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGatewayTarget(id: String, initializer: @AwsCdkDsl CfnGatewayTarget.Builder.() -> Unit = {}): CfnGatewayTarget = CfnGatewayTarget.Builder.create(this, id).apply(initializer).build()
