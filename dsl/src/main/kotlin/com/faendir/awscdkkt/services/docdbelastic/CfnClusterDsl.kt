package com.faendir.awscdkkt.services.docdbelastic

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdbelastic.CfnCluster
import software.amazon.awscdk.services.docdbelastic.CfnClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCluster(
  id: String,
  props: CfnClusterProps,
  initializer: CfnCluster.() -> Unit = {},
): CfnCluster = CfnCluster(this, id, props).apply(initializer)
