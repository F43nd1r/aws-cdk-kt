package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.constructs.Construct

@Generated
public fun Construct.accessKeysRotated(id: String): AccessKeysRotated = AccessKeysRotated(this, id)

@Generated
public fun Construct.accessKeysRotated(id: String, initializer: @AwsCdkDsl
    AccessKeysRotated.() -> Unit): AccessKeysRotated = AccessKeysRotated(this,
    id).apply(initializer)

@Generated
public fun Construct.accessKeysRotated(id: String, props: AccessKeysRotatedProps): AccessKeysRotated
    = AccessKeysRotated(this, id, props)

@Generated
public fun Construct.accessKeysRotated(
  id: String,
  props: AccessKeysRotatedProps,
  initializer: @AwsCdkDsl AccessKeysRotated.() -> Unit,
): AccessKeysRotated = AccessKeysRotated(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAccessKeysRotated(id: String, initializer: @AwsCdkDsl
    AccessKeysRotated.Builder.() -> Unit): AccessKeysRotated =
    AccessKeysRotated.Builder.create(this, id).apply(initializer).build()
