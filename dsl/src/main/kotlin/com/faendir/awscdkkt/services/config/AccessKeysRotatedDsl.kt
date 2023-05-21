package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.constructs.Construct

@Generated
public fun Construct.accessKeysRotated(id: String, initializer: AccessKeysRotated.() -> Unit = {}):
    AccessKeysRotated = AccessKeysRotated(this, id).apply(initializer)

@Generated
public fun Construct.accessKeysRotated(
  id: String,
  props: AccessKeysRotatedProps,
  initializer: AccessKeysRotated.() -> Unit = {},
): AccessKeysRotated = AccessKeysRotated(this, id, props).apply(initializer)
