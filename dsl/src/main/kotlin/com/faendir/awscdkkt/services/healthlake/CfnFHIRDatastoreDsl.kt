@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.healthlake

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps
import software.constructs.Construct

public fun Construct.cfnFHIRDatastore(
  id: String,
  props: CfnFHIRDatastoreProps,
  initializer: CfnFHIRDatastore.() -> Unit = {},
): CfnFHIRDatastore = CfnFHIRDatastore(this, id, props).apply(initializer)
