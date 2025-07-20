package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnFlowVersion
import software.amazon.awscdk.services.bedrock.CfnFlowVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowVersion(
  id: String,
  props: CfnFlowVersionProps,
  initializer: @AwsCdkDsl CfnFlowVersion.() -> Unit = {},
): CfnFlowVersion = CfnFlowVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlowVersion(id: String, initializer: @AwsCdkDsl CfnFlowVersion.Builder.() -> Unit = {}): CfnFlowVersion = CfnFlowVersion.Builder.create(this, id).apply(initializer).build()
