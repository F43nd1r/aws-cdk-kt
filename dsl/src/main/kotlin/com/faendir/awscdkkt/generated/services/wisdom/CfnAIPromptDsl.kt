package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAIPrompt
import software.amazon.awscdk.services.wisdom.CfnAIPromptProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAIPrompt(
  id: String,
  props: CfnAIPromptProps,
  initializer: @AwsCdkDsl CfnAIPrompt.() -> Unit = {},
): CfnAIPrompt = CfnAIPrompt(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAIPrompt(id: String, initializer: @AwsCdkDsl CfnAIPrompt.Builder.() -> Unit = {}): CfnAIPrompt = CfnAIPrompt.Builder.create(this, id).apply(initializer).build()
