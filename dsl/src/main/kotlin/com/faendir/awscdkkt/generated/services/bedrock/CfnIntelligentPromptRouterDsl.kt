package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter
import software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIntelligentPromptRouter(
  id: String,
  props: CfnIntelligentPromptRouterProps,
  initializer: @AwsCdkDsl CfnIntelligentPromptRouter.() -> Unit = {},
): CfnIntelligentPromptRouter = CfnIntelligentPromptRouter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIntelligentPromptRouter(id: String, initializer: @AwsCdkDsl
    CfnIntelligentPromptRouter.Builder.() -> Unit = {}): CfnIntelligentPromptRouter =
    CfnIntelligentPromptRouter.Builder.create(this, id).apply(initializer).build()
