package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAIAgentVersion
import software.amazon.awscdk.services.wisdom.CfnAIAgentVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAIAgentVersion(
  id: String,
  props: CfnAIAgentVersionProps,
  initializer: @AwsCdkDsl CfnAIAgentVersion.() -> Unit = {},
): CfnAIAgentVersion = CfnAIAgentVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAIAgentVersion(id: String, initializer: @AwsCdkDsl
    CfnAIAgentVersion.Builder.() -> Unit = {}): CfnAIAgentVersion =
    CfnAIAgentVersion.Builder.create(this, id).apply(initializer).build()
