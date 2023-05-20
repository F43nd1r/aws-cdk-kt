@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps
import software.constructs.Construct

public fun Construct.snsPublish(
  id: String,
  props: SnsPublishProps,
  initializer: SnsPublish.() -> Unit = {},
): SnsPublish = SnsPublish(this, id, props).apply(initializer)
