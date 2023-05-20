@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogRetention
import software.amazon.awscdk.services.logs.LogRetentionProps
import software.constructs.Construct

public fun Construct.logRetention(
  id: String,
  props: LogRetentionProps,
  initializer: LogRetention.() -> Unit = {},
): LogRetention = LogRetention(this, id, props).apply(initializer)
