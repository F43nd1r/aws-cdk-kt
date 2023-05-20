@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnLogStream
import software.amazon.awscdk.services.logs.CfnLogStreamProps
import software.constructs.Construct

public fun Construct.cfnLogStream(
  id: String,
  props: CfnLogStreamProps,
  initializer: CfnLogStream.() -> Unit = {},
): CfnLogStream = CfnLogStream(this, id, props).apply(initializer)
