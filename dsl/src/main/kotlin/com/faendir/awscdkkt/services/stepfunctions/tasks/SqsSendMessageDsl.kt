package com.faendir.awscdkkt.services.stepfunctions.tasks

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
  initializer: SqsSendMessage.() -> Unit = {},
): SqsSendMessage = SqsSendMessage(this, id, props).apply(initializer)
