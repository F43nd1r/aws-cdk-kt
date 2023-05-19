@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.LogGroupProps
import software.constructs.Construct

public fun Construct.logGroup(id: String, initializer: LogGroup.() -> Unit = {}): LogGroup =
    LogGroup(this, id).apply(initializer)

public fun Construct.logGroup(
  id: String,
  props: LogGroupProps,
  initializer: LogGroup.() -> Unit = {},
): LogGroup = LogGroup(this, id, props).apply(initializer)
