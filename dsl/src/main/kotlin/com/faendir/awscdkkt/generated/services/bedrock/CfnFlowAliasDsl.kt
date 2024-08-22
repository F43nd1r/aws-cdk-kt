package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnFlowAlias
import software.amazon.awscdk.services.bedrock.CfnFlowAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowAlias(
  id: String,
  props: CfnFlowAliasProps,
  initializer: @AwsCdkDsl CfnFlowAlias.() -> Unit = {},
): CfnFlowAlias = CfnFlowAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlowAlias(id: String, initializer: @AwsCdkDsl
    CfnFlowAlias.Builder.() -> Unit = {}): CfnFlowAlias = CfnFlowAlias.Builder.create(this,
    id).apply(initializer).build()
