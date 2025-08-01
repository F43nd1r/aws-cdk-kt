package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogRetention
import software.amazon.awscdk.services.logs.LogRetentionProps
import software.constructs.Construct

@Generated
public fun Construct.logRetention(
  id: String,
  props: LogRetentionProps,
  initializer: @AwsCdkDsl LogRetention.() -> Unit = {},
): LogRetention = LogRetention(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLogRetention(id: String, initializer: @AwsCdkDsl LogRetention.Builder.() -> Unit = {}): LogRetention = LogRetention.Builder.create(this, id).apply(initializer).build()
