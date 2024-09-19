package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnAgentStatus
import software.amazon.awscdk.services.connect.CfnAgentStatusProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAgentStatus(
  id: String,
  props: CfnAgentStatusProps,
  initializer: @AwsCdkDsl CfnAgentStatus.() -> Unit = {},
): CfnAgentStatus = CfnAgentStatus(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAgentStatus(id: String, initializer: @AwsCdkDsl
    CfnAgentStatus.Builder.() -> Unit = {}): CfnAgentStatus = CfnAgentStatus.Builder.create(this,
    id).apply(initializer).build()
