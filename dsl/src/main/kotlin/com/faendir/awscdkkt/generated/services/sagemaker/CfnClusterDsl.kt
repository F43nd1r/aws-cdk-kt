package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnCluster
import software.amazon.awscdk.services.sagemaker.CfnClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCluster(
  id: String,
  props: CfnClusterProps,
  initializer: @AwsCdkDsl CfnCluster.() -> Unit = {},
): CfnCluster = CfnCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCluster(id: String, initializer: @AwsCdkDsl CfnCluster.Builder.() -> Unit = {}): CfnCluster = CfnCluster.Builder.create(this, id).apply(initializer).build()
