package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogStream
import software.amazon.awscdk.services.logs.LogStreamProps
import software.constructs.Construct

@Generated
public fun Construct.logStream(
  id: String,
  props: LogStreamProps,
  initializer: LogStream.() -> Unit = {},
): LogStream = LogStream(this, id, props).apply(initializer)
