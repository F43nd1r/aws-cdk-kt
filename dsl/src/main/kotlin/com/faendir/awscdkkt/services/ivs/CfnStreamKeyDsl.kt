@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
