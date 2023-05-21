package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnLogStream
import software.amazon.awscdk.services.logs.CfnLogStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogStream(
  id: String,
  props: CfnLogStreamProps,
  initializer: CfnLogStream.() -> Unit = {},
): CfnLogStream = CfnLogStream(this, id, props).apply(initializer)
