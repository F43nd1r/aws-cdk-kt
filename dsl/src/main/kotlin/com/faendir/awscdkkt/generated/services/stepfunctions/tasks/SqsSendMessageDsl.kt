package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps
import software.constructs.Construct

@Generated
public fun Construct.sqsSendMessage(
  id: String,
  props: SqsSendMessageProps,
  initializer: @AwsCdkDsl SqsSendMessage.() -> Unit = {},
): SqsSendMessage = SqsSendMessage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSqsSendMessage(id: String, initializer: @AwsCdkDsl
    SqsSendMessage.Builder.() -> Unit = {}): SqsSendMessage = SqsSendMessage.Builder.create(this,
    id).apply(initializer).build()
