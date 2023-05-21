package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.KeyGroup
import software.amazon.awscdk.services.cloudfront.KeyGroupProps
import software.constructs.Construct

@Generated
public fun Construct.keyGroup(
  id: String,
  props: KeyGroupProps,
  initializer: KeyGroup.() -> Unit = {},
): KeyGroup = KeyGroup(this, id, props).apply(initializer)
