package com.faendir.awscdkkt.generated.services.timestream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnInfluxDBCluster
import software.amazon.awscdk.services.timestream.CfnInfluxDBClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInfluxDBCluster(id: String, initializer: @AwsCdkDsl CfnInfluxDBCluster.() -> Unit = {}): CfnInfluxDBCluster = CfnInfluxDBCluster(this, id).apply(initializer)

@Generated
public fun Construct.cfnInfluxDBCluster(
  id: String,
  props: CfnInfluxDBClusterProps,
  initializer: @AwsCdkDsl CfnInfluxDBCluster.() -> Unit = {},
): CfnInfluxDBCluster = CfnInfluxDBCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInfluxDBCluster(id: String, initializer: @AwsCdkDsl CfnInfluxDBCluster.Builder.() -> Unit = {}): CfnInfluxDBCluster = CfnInfluxDBCluster.Builder.create(this, id).apply(initializer).build()
