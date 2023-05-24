package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnPartition
import software.amazon.awscdk.services.glue.CfnPartitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPartition(id: String, props: CfnPartitionProps): CfnPartition =
    CfnPartition(this, id, props)

@Generated
public fun Construct.cfnPartition(
  id: String,
  props: CfnPartitionProps,
  initializer: @AwsCdkDsl CfnPartition.() -> Unit,
): CfnPartition = CfnPartition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPartition(id: String, initializer: @AwsCdkDsl
    CfnPartition.Builder.() -> Unit): CfnPartition = CfnPartition.Builder.create(this,
    id).apply(initializer).build()
