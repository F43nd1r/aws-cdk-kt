package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.AliasProps
import software.constructs.Construct

@Generated
public fun Construct.alias(
  id: String,
  props: AliasProps,
  initializer: Alias.() -> Unit = {},
): Alias = Alias(this, id, props).apply(initializer)
