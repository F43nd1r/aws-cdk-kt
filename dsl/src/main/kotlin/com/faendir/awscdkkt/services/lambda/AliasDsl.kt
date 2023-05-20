@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.AliasProps
import software.constructs.Construct

public fun Construct.alias(
  id: String,
  props: AliasProps,
  initializer: Alias.() -> Unit = {},
): Alias = Alias(this, id, props).apply(initializer)
