package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.amazon.awscdk.services.wisdom.CfnAssistantProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssistant(
  id: String,
  props: CfnAssistantProps,
  initializer: @AwsCdkDsl CfnAssistant.() -> Unit = {},
): CfnAssistant = CfnAssistant(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssistant(id: String, initializer: @AwsCdkDsl CfnAssistant.Builder.() -> Unit = {}): CfnAssistant = CfnAssistant.Builder.create(this, id).apply(initializer).build()
