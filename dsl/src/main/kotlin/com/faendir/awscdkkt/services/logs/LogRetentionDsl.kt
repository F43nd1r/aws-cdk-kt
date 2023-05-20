@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
