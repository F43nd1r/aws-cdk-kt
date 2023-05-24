package com.faendir.awscdkkt.generated.services.cloudtrail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventDataStore(id: String, props: CfnEventDataStoreProps): CfnEventDataStore
    = CfnEventDataStore(this, id, props)

@Generated
public fun Construct.cfnEventDataStore(
  id: String,
  props: CfnEventDataStoreProps,
  initializer: @AwsCdkDsl CfnEventDataStore.() -> Unit,
): CfnEventDataStore = CfnEventDataStore(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnEventDataStore(id: String): CfnEventDataStore = CfnEventDataStore(this, id)

@Generated
public fun Construct.cfnEventDataStore(id: String, initializer: @AwsCdkDsl
    CfnEventDataStore.() -> Unit): CfnEventDataStore = CfnEventDataStore(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnEventDataStore(id: String, initializer: @AwsCdkDsl
    CfnEventDataStore.Builder.() -> Unit): CfnEventDataStore =
    CfnEventDataStore.Builder.create(this, id).apply(initializer).build()
