package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.KeyValueStore
import software.amazon.awscdk.services.cloudfront.KeyValueStoreProps
import software.constructs.Construct

@Generated
public fun Construct.keyValueStore(id: String, initializer: @AwsCdkDsl KeyValueStore.() -> Unit = {}): KeyValueStore = KeyValueStore(this, id).apply(initializer)

@Generated
public fun Construct.keyValueStore(
  id: String,
  props: KeyValueStoreProps,
  initializer: @AwsCdkDsl KeyValueStore.() -> Unit = {},
): KeyValueStore = KeyValueStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKeyValueStore(id: String, initializer: @AwsCdkDsl KeyValueStore.Builder.() -> Unit = {}): KeyValueStore = KeyValueStore.Builder.create(this, id).apply(initializer).build()
