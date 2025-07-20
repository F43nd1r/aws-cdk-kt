package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnGuardrail
import software.amazon.awscdk.services.bedrock.CfnGuardrailProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGuardrail(
  id: String,
  props: CfnGuardrailProps,
  initializer: @AwsCdkDsl CfnGuardrail.() -> Unit = {},
): CfnGuardrail = CfnGuardrail(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGuardrail(id: String, initializer: @AwsCdkDsl CfnGuardrail.Builder.() -> Unit = {}): CfnGuardrail = CfnGuardrail.Builder.create(this, id).apply(initializer).build()
