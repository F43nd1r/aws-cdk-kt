package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnKeyValueStore
import software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKeyValueStore(
  id: String,
  props: CfnKeyValueStoreProps,
  initializer: @AwsCdkDsl CfnKeyValueStore.() -> Unit = {},
): CfnKeyValueStore = CfnKeyValueStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnKeyValueStore(id: String, initializer: @AwsCdkDsl
    CfnKeyValueStore.Builder.() -> Unit = {}): CfnKeyValueStore =
    CfnKeyValueStore.Builder.create(this, id).apply(initializer).build()
