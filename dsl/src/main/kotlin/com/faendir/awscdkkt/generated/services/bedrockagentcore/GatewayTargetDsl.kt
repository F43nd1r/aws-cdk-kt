package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.GatewayTarget
import software.amazon.awscdk.services.bedrockagentcore.GatewayTargetProps
import software.constructs.Construct

@Generated
public fun Construct.gatewayTarget(
  id: String,
  props: GatewayTargetProps,
  initializer: @AwsCdkDsl GatewayTarget.() -> Unit = {},
): GatewayTarget = GatewayTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGatewayTarget(id: String, initializer: @AwsCdkDsl GatewayTarget.Builder.() -> Unit = {}): GatewayTarget = GatewayTarget.Builder.create(this, id).apply(initializer).build()
