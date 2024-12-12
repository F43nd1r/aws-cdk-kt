package com.faendir.awscdkkt.generated.services.memorydb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster
import software.amazon.awscdk.services.memorydb.CfnMultiRegionClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMultiRegionCluster(
  id: String,
  props: CfnMultiRegionClusterProps,
  initializer: @AwsCdkDsl CfnMultiRegionCluster.() -> Unit = {},
): CfnMultiRegionCluster = CfnMultiRegionCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMultiRegionCluster(id: String, initializer: @AwsCdkDsl
    CfnMultiRegionCluster.Builder.() -> Unit = {}): CfnMultiRegionCluster =
    CfnMultiRegionCluster.Builder.create(this, id).apply(initializer).build()
