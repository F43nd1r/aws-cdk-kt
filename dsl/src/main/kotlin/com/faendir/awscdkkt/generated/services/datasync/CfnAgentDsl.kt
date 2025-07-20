package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnAgent
import software.amazon.awscdk.services.datasync.CfnAgentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAgent(id: String, initializer: @AwsCdkDsl CfnAgent.() -> Unit = {}): CfnAgent = CfnAgent(this, id).apply(initializer)

@Generated
public fun Construct.cfnAgent(
  id: String,
  props: CfnAgentProps,
  initializer: @AwsCdkDsl CfnAgent.() -> Unit = {},
): CfnAgent = CfnAgent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAgent(id: String, initializer: @AwsCdkDsl CfnAgent.Builder.() -> Unit = {}): CfnAgent = CfnAgent.Builder.create(this, id).apply(initializer).build()
