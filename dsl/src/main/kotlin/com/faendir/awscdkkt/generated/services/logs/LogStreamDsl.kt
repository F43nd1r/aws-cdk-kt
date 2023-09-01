package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl LogStream.() -> Unit = {},
): LogStream = LogStream(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLogStream(id: String, initializer: @AwsCdkDsl LogStream.Builder.() -> Unit
    = {}): LogStream = LogStream.Builder.create(this, id).apply(initializer).build()
