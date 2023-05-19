@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStream
import software.amazon.awscdk.services.kinesis.CfnStreamProps
import software.constructs.Construct

public fun Construct.cfnStream(id: String, initializer: CfnStream.() -> Unit = {}): CfnStream =
    CfnStream(this, id).apply(initializer)

public fun Construct.cfnStream(
  id: String,
  props: CfnStreamProps,
  initializer: CfnStream.() -> Unit = {},
): CfnStream = CfnStream(this, id, props).apply(initializer)
