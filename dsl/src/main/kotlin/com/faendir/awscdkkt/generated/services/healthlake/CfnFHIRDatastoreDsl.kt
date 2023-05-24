package com.faendir.awscdkkt.generated.services.healthlake

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFHIRDatastore(id: String, props: CfnFHIRDatastoreProps): CfnFHIRDatastore =
    CfnFHIRDatastore(this, id, props)

@Generated
public fun Construct.cfnFHIRDatastore(
  id: String,
  props: CfnFHIRDatastoreProps,
  initializer: @AwsCdkDsl CfnFHIRDatastore.() -> Unit,
): CfnFHIRDatastore = CfnFHIRDatastore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFHIRDatastore(id: String, initializer: @AwsCdkDsl
    CfnFHIRDatastore.Builder.() -> Unit): CfnFHIRDatastore = CfnFHIRDatastore.Builder.create(this,
    id).apply(initializer).build()
