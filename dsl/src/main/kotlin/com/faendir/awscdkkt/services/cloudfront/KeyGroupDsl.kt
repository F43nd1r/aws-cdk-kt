@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.KeyGroup
import software.amazon.awscdk.services.cloudfront.KeyGroupProps
import software.constructs.Construct

public fun Construct.keyGroup(
  id: String,
  props: KeyGroupProps,
  initializer: KeyGroup.() -> Unit = {},
): KeyGroup = KeyGroup(this, id, props).apply(initializer)
