package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import software.amazon.awscdk.services.msk.CfnServerlessClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServerlessCluster(
  id: String,
  props: CfnServerlessClusterProps,
  initializer: @AwsCdkDsl CfnServerlessCluster.() -> Unit = {},
): CfnServerlessCluster = CfnServerlessCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServerlessCluster(id: String, initializer: @AwsCdkDsl CfnServerlessCluster.Builder.() -> Unit = {}): CfnServerlessCluster = CfnServerlessCluster.Builder.create(this, id).apply(initializer).build()
