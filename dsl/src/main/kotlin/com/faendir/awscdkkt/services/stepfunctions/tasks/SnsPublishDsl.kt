package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps
import software.constructs.Construct

@Generated
public fun Construct.snsPublish(
  id: String,
  props: SnsPublishProps,
  initializer: SnsPublish.() -> Unit = {},
): SnsPublish = SnsPublish(this, id, props).apply(initializer)
