package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAIGuardrail
import software.amazon.awscdk.services.wisdom.CfnAIGuardrailProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAIGuardrail(
  id: String,
  props: CfnAIGuardrailProps,
  initializer: @AwsCdkDsl CfnAIGuardrail.() -> Unit = {},
): CfnAIGuardrail = CfnAIGuardrail(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAIGuardrail(id: String, initializer: @AwsCdkDsl CfnAIGuardrail.Builder.() -> Unit = {}): CfnAIGuardrail = CfnAIGuardrail.Builder.create(this, id).apply(initializer).build()
