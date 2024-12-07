package com.faendir.awscdkkt.generated.services.chatbot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.CfnCustomAction
import software.amazon.awscdk.services.chatbot.CfnCustomActionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomAction(
  id: String,
  props: CfnCustomActionProps,
  initializer: @AwsCdkDsl CfnCustomAction.() -> Unit = {},
): CfnCustomAction = CfnCustomAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomAction(id: String, initializer: @AwsCdkDsl
    CfnCustomAction.Builder.() -> Unit = {}): CfnCustomAction = CfnCustomAction.Builder.create(this,
    id).apply(initializer).build()
