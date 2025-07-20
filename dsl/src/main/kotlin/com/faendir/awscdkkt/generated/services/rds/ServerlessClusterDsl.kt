package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessCluster
import software.amazon.awscdk.services.rds.ServerlessClusterProps
import software.constructs.Construct

@Generated
public fun Construct.serverlessCluster(
  id: String,
  props: ServerlessClusterProps,
  initializer: @AwsCdkDsl ServerlessCluster.() -> Unit = {},
): ServerlessCluster = ServerlessCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildServerlessCluster(id: String, initializer: @AwsCdkDsl ServerlessCluster.Builder.() -> Unit = {}): ServerlessCluster = ServerlessCluster.Builder.create(this, id).apply(initializer).build()
