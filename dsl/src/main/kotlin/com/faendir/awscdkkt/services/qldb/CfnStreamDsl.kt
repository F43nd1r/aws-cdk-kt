@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.qldb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnStream
import software.amazon.awscdk.services.qldb.CfnStreamProps
import software.constructs.Construct

public fun Construct.cfnStream(
  id: String,
  props: CfnStreamProps,
  initializer: CfnStream.() -> Unit = {},
): CfnStream = CfnStream(this, id, props).apply(initializer)
