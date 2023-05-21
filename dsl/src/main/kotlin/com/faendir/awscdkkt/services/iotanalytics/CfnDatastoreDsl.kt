package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDatastore(id: String, initializer: CfnDatastore.() -> Unit = {}):
    CfnDatastore = CfnDatastore(this, id).apply(initializer)

@Generated
public fun Construct.cfnDatastore(
  id: String,
  props: CfnDatastoreProps,
  initializer: CfnDatastore.() -> Unit = {},
): CfnDatastore = CfnDatastore(this, id, props).apply(initializer)
