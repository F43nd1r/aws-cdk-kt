package com.faendir.awscdkkt.generated.services.odb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.odb.CfnCloudVmCluster
import software.amazon.awscdk.services.odb.CfnCloudVmClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudVmCluster(id: String, initializer: @AwsCdkDsl
    CfnCloudVmCluster.() -> Unit = {}): CfnCloudVmCluster = CfnCloudVmCluster(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnCloudVmCluster(
  id: String,
  props: CfnCloudVmClusterProps,
  initializer: @AwsCdkDsl CfnCloudVmCluster.() -> Unit = {},
): CfnCloudVmCluster = CfnCloudVmCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudVmCluster(id: String, initializer: @AwsCdkDsl
    CfnCloudVmCluster.Builder.() -> Unit = {}): CfnCloudVmCluster =
    CfnCloudVmCluster.Builder.create(this, id).apply(initializer).build()
