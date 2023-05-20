@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnAgent
import software.amazon.awscdk.services.datasync.CfnAgentProps
import software.constructs.Construct

public fun Construct.cfnAgent(
  id: String,
  props: CfnAgentProps,
  initializer: CfnAgent.() -> Unit = {},
): CfnAgent = CfnAgent(this, id, props).apply(initializer)

public fun Construct.cfnAgent(id: String, initializer: CfnAgent.() -> Unit = {}): CfnAgent =
    CfnAgent(this, id).apply(initializer)
