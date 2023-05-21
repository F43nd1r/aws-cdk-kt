package com.faendir.awscdkkt.services.kinesisvideo

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisvideo.CfnStream
import software.amazon.awscdk.services.kinesisvideo.CfnStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStream(id: String, initializer: CfnStream.() -> Unit = {}): CfnStream =
    CfnStream(this, id).apply(initializer)

@Generated
public fun Construct.cfnStream(
  id: String,
  props: CfnStreamProps,
  initializer: CfnStream.() -> Unit = {},
): CfnStream = CfnStream(this, id, props).apply(initializer)
