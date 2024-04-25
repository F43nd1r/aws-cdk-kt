package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnAgent
import software.amazon.awscdk.services.bedrock.CfnAgentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAgent(
  id: String,
  props: CfnAgentProps,
  initializer: @AwsCdkDsl CfnAgent.() -> Unit = {},
): CfnAgent = CfnAgent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAgent(id: String, initializer: @AwsCdkDsl CfnAgent.Builder.() -> Unit =
    {}): CfnAgent = CfnAgent.Builder.create(this, id).apply(initializer).build()
