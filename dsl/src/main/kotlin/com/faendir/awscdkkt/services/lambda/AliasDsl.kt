@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
