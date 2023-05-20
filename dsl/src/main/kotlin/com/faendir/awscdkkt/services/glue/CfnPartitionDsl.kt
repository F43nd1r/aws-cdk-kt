@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnPartition
import software.amazon.awscdk.services.glue.CfnPartitionProps
import software.constructs.Construct

public fun Construct.cfnPartition(
  id: String,
  props: CfnPartitionProps,
  initializer: CfnPartition.() -> Unit = {},
): CfnPartition = CfnPartition(this, id, props).apply(initializer)
