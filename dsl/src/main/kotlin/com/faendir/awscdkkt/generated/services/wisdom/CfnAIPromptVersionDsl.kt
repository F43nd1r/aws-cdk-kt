package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAIPromptVersion
import software.amazon.awscdk.services.wisdom.CfnAIPromptVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAIPromptVersion(
  id: String,
  props: CfnAIPromptVersionProps,
  initializer: @AwsCdkDsl CfnAIPromptVersion.() -> Unit = {},
): CfnAIPromptVersion = CfnAIPromptVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAIPromptVersion(id: String, initializer: @AwsCdkDsl
    CfnAIPromptVersion.Builder.() -> Unit = {}): CfnAIPromptVersion =
    CfnAIPromptVersion.Builder.create(this, id).apply(initializer).build()
