@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps
import software.constructs.Construct

public fun Construct.cfnEventDataStore(id: String, initializer: CfnEventDataStore.() -> Unit = {}):
    CfnEventDataStore = CfnEventDataStore(this, id).apply(initializer)

public fun Construct.cfnEventDataStore(
  id: String,
  props: CfnEventDataStoreProps,
  initializer: CfnEventDataStore.() -> Unit = {},
): CfnEventDataStore = CfnEventDataStore(this, id, props).apply(initializer)
