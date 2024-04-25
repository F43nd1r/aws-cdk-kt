package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnAgentAlias
import software.amazon.awscdk.services.bedrock.CfnAgentAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAgentAlias(
  id: String,
  props: CfnAgentAliasProps,
  initializer: @AwsCdkDsl CfnAgentAlias.() -> Unit = {},
): CfnAgentAlias = CfnAgentAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAgentAlias(id: String, initializer: @AwsCdkDsl
    CfnAgentAlias.Builder.() -> Unit = {}): CfnAgentAlias = CfnAgentAlias.Builder.create(this,
    id).apply(initializer).build()
