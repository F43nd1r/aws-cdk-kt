@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisvideo

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisvideo.CfnStream
import software.amazon.awscdk.services.kinesisvideo.CfnStreamProps
import software.constructs.Construct

public fun Construct.cfnStream(id: String, initializer: CfnStream.() -> Unit = {}): CfnStream =
    CfnStream(this, id).apply(initializer)

public fun Construct.cfnStream(
  id: String,
  props: CfnStreamProps,
  initializer: CfnStream.() -> Unit = {},
): CfnStream = CfnStream(this, id, props).apply(initializer)
