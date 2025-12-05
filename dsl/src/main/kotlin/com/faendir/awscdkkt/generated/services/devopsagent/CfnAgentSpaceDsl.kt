package com.faendir.awscdkkt.generated.services.devopsagent

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsagent.CfnAgentSpace
import software.amazon.awscdk.services.devopsagent.CfnAgentSpaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAgentSpace(
  id: String,
  props: CfnAgentSpaceProps,
  initializer: @AwsCdkDsl CfnAgentSpace.() -> Unit = {},
): CfnAgentSpace = CfnAgentSpace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAgentSpace(id: String, initializer: @AwsCdkDsl CfnAgentSpace.Builder.() -> Unit = {}): CfnAgentSpace = CfnAgentSpace.Builder.create(this, id).apply(initializer).build()
