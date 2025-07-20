package com.faendir.awscdkkt.generated.services.kms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.KeyProps
import software.constructs.Construct

@Generated
public fun Construct.key(id: String, initializer: @AwsCdkDsl Key.() -> Unit = {}): Key = Key(this, id).apply(initializer)

@Generated
public fun Construct.key(
  id: String,
  props: KeyProps,
  initializer: @AwsCdkDsl Key.() -> Unit = {},
): Key = Key(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKey(id: String, initializer: @AwsCdkDsl Key.Builder.() -> Unit = {}): Key = Key.Builder.create(this, id).apply(initializer).build()
