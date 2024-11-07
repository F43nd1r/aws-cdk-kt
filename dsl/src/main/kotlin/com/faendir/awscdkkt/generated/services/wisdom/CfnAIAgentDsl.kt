package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAIAgent
import software.amazon.awscdk.services.wisdom.CfnAIAgentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAIAgent(
  id: String,
  props: CfnAIAgentProps,
  initializer: @AwsCdkDsl CfnAIAgent.() -> Unit = {},
): CfnAIAgent = CfnAIAgent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAIAgent(id: String, initializer: @AwsCdkDsl
    CfnAIAgent.Builder.() -> Unit = {}): CfnAIAgent = CfnAIAgent.Builder.create(this,
    id).apply(initializer).build()
