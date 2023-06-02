package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnPrompt
import software.amazon.awscdk.services.connect.CfnPromptProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrompt(id: String, props: CfnPromptProps): CfnPrompt = CfnPrompt(this, id,
    props)

@Generated
public fun Construct.cfnPrompt(
  id: String,
  props: CfnPromptProps,
  initializer: @AwsCdkDsl CfnPrompt.() -> Unit,
): CfnPrompt = CfnPrompt(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrompt(id: String, initializer: @AwsCdkDsl
    CfnPrompt.Builder.() -> Unit): CfnPrompt = CfnPrompt.Builder.create(this,
    id).apply(initializer).build()
