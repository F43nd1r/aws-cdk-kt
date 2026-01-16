package com.faendir.awscdkkt.generated.services.docdb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.CfnGlobalCluster
import software.amazon.awscdk.services.docdb.CfnGlobalClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalCluster(
  id: String,
  props: CfnGlobalClusterProps,
  initializer: @AwsCdkDsl CfnGlobalCluster.() -> Unit = {},
): CfnGlobalCluster = CfnGlobalCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGlobalCluster(id: String, initializer: @AwsCdkDsl CfnGlobalCluster.Builder.() -> Unit = {}): CfnGlobalCluster = CfnGlobalCluster.Builder.create(this, id).apply(initializer).build()
