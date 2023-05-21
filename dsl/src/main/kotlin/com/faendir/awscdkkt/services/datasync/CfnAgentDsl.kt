package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnAgent
import software.amazon.awscdk.services.datasync.CfnAgentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAgent(id: String, initializer: CfnAgent.() -> Unit = {}): CfnAgent =
    CfnAgent(this, id).apply(initializer)

@Generated
public fun Construct.cfnAgent(
  id: String,
  props: CfnAgentProps,
  initializer: CfnAgent.() -> Unit = {},
): CfnAgent = CfnAgent(this, id, props).apply(initializer)
