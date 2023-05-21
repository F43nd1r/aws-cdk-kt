package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventDataStore(id: String, initializer: CfnEventDataStore.() -> Unit = {}):
    CfnEventDataStore = CfnEventDataStore(this, id).apply(initializer)

@Generated
public fun Construct.cfnEventDataStore(
  id: String,
  props: CfnEventDataStoreProps,
  initializer: CfnEventDataStore.() -> Unit = {},
): CfnEventDataStore = CfnEventDataStore(this, id, props).apply(initializer)
