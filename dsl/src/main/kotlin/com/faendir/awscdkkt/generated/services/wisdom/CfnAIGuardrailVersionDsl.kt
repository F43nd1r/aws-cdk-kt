package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion
import software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAIGuardrailVersion(
  id: String,
  props: CfnAIGuardrailVersionProps,
  initializer: @AwsCdkDsl CfnAIGuardrailVersion.() -> Unit = {},
): CfnAIGuardrailVersion = CfnAIGuardrailVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAIGuardrailVersion(id: String, initializer: @AwsCdkDsl CfnAIGuardrailVersion.Builder.() -> Unit = {}): CfnAIGuardrailVersion = CfnAIGuardrailVersion.Builder.create(this, id).apply(initializer).build()
