@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnStreamKey
import software.amazon.awscdk.services.ivs.CfnStreamKeyProps
import software.constructs.Construct

public fun Construct.cfnStreamKey(
  id: String,
  props: CfnStreamKeyProps,
  initializer: CfnStreamKey.() -> Unit = {},
): CfnStreamKey = CfnStreamKey(this, id, props).apply(initializer)
