package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.LogGroupProps
import software.constructs.Construct

@Generated
public fun Construct.logGroup(id: String): LogGroup = LogGroup(this, id)

@Generated
public fun Construct.logGroup(id: String, initializer: @AwsCdkDsl LogGroup.() -> Unit): LogGroup =
    LogGroup(this, id).apply(initializer)

@Generated
public fun Construct.logGroup(id: String, props: LogGroupProps): LogGroup = LogGroup(this, id,
    props)

@Generated
public fun Construct.logGroup(
  id: String,
  props: LogGroupProps,
  initializer: @AwsCdkDsl LogGroup.() -> Unit,
): LogGroup = LogGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLogGroup(id: String, initializer: @AwsCdkDsl LogGroup.Builder.() -> Unit):
    LogGroup = LogGroup.Builder.create(this, id).apply(initializer).build()
