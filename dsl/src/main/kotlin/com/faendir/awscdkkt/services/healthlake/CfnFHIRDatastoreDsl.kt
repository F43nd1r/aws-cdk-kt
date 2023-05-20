@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
