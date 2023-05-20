@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.constructs.Construct

public fun Construct.accessKeysRotated(id: String, initializer: AccessKeysRotated.() -> Unit = {}):
    AccessKeysRotated = AccessKeysRotated(this, id).apply(initializer)

public fun Construct.accessKeysRotated(
  id: String,
  props: AccessKeysRotatedProps,
  initializer: AccessKeysRotated.() -> Unit = {},
): AccessKeysRotated = AccessKeysRotated(this, id, props).apply(initializer)
