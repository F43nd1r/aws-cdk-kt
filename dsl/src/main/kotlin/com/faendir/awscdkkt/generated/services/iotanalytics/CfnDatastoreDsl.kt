package com.faendir.awscdkkt.generated.services.iotanalytics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDatastore(id: String): CfnDatastore = CfnDatastore(this, id)

@Generated
public fun Construct.cfnDatastore(id: String, initializer: @AwsCdkDsl CfnDatastore.() -> Unit):
    CfnDatastore = CfnDatastore(this, id).apply(initializer)

@Generated
public fun Construct.cfnDatastore(id: String, props: CfnDatastoreProps): CfnDatastore =
    CfnDatastore(this, id, props)

@Generated
public fun Construct.cfnDatastore(
  id: String,
  props: CfnDatastoreProps,
  initializer: @AwsCdkDsl CfnDatastore.() -> Unit,
): CfnDatastore = CfnDatastore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDatastore(id: String, initializer: @AwsCdkDsl
    CfnDatastore.Builder.() -> Unit): CfnDatastore = CfnDatastore.Builder.create(this,
    id).apply(initializer).build()
