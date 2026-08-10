package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnDefaultPromptRouter
import software.amazon.awscdk.services.bedrock.CfnDefaultPromptRouterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDefaultPromptRouter(id: String, initializer: @AwsCdkDsl CfnDefaultPromptRouter.() -> Unit = {}): CfnDefaultPromptRouter = CfnDefaultPromptRouter(this, id).apply(initializer)

@Generated
public fun Construct.cfnDefaultPromptRouter(
  id: String,
  props: CfnDefaultPromptRouterProps,
  initializer: @AwsCdkDsl CfnDefaultPromptRouter.() -> Unit = {},
): CfnDefaultPromptRouter = CfnDefaultPromptRouter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDefaultPromptRouter(id: String, initializer: @AwsCdkDsl CfnDefaultPromptRouter.Builder.() -> Unit = {}): CfnDefaultPromptRouter = CfnDefaultPromptRouter.Builder.create(this, id).apply(initializer).build()
