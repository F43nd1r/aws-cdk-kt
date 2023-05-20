@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogStream
import software.amazon.awscdk.services.logs.LogStreamProps
import software.constructs.Construct

public fun Construct.logStream(
  id: String,
  props: LogStreamProps,
  initializer: LogStream.() -> Unit = {},
): LogStream = LogStream(this, id, props).apply(initializer)
