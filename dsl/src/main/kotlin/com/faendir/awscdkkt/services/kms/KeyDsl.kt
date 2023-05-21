package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.KeyProps
import software.constructs.Construct

@Generated
public fun Construct.key(id: String, initializer: Key.() -> Unit = {}): Key = Key(this,
    id).apply(initializer)

@Generated
public fun Construct.key(
  id: String,
  props: KeyProps,
  initializer: Key.() -> Unit = {},
): Key = Key(this, id, props).apply(initializer)
