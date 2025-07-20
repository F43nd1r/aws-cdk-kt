package com.faendir.awscdkkt.generated.services.odb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.odb.CfnCloudAutonomousVmCluster
import software.amazon.awscdk.services.odb.CfnCloudAutonomousVmClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudAutonomousVmCluster(id: String, initializer: @AwsCdkDsl CfnCloudAutonomousVmCluster.() -> Unit = {}): CfnCloudAutonomousVmCluster = CfnCloudAutonomousVmCluster(this, id).apply(initializer)

@Generated
public fun Construct.cfnCloudAutonomousVmCluster(
  id: String,
  props: CfnCloudAutonomousVmClusterProps,
  initializer: @AwsCdkDsl CfnCloudAutonomousVmCluster.() -> Unit = {},
): CfnCloudAutonomousVmCluster = CfnCloudAutonomousVmCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudAutonomousVmCluster(id: String, initializer: @AwsCdkDsl CfnCloudAutonomousVmCluster.Builder.() -> Unit = {}): CfnCloudAutonomousVmCluster = CfnCloudAutonomousVmCluster.Builder.create(this, id).apply(initializer).build()
