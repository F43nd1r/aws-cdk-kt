package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnPromptVersion
import software.amazon.awscdk.services.bedrock.CfnPromptVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPromptVersion(
  id: String,
  props: CfnPromptVersionProps,
  initializer: @AwsCdkDsl CfnPromptVersion.() -> Unit = {},
): CfnPromptVersion = CfnPromptVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPromptVersion(id: String, initializer: @AwsCdkDsl CfnPromptVersion.Builder.() -> Unit = {}): CfnPromptVersion = CfnPromptVersion.Builder.create(this, id).apply(initializer).build()
