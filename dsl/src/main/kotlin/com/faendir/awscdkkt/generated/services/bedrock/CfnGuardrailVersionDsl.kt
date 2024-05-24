package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnGuardrailVersion
import software.amazon.awscdk.services.bedrock.CfnGuardrailVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGuardrailVersion(
  id: String,
  props: CfnGuardrailVersionProps,
  initializer: @AwsCdkDsl CfnGuardrailVersion.() -> Unit = {},
): CfnGuardrailVersion = CfnGuardrailVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGuardrailVersion(id: String, initializer: @AwsCdkDsl
    CfnGuardrailVersion.Builder.() -> Unit = {}): CfnGuardrailVersion =
    CfnGuardrailVersion.Builder.create(this, id).apply(initializer).build()
