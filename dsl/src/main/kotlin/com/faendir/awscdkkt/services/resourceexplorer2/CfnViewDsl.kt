@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.resourceexplorer2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourceexplorer2.CfnView
import software.amazon.awscdk.services.resourceexplorer2.CfnViewProps
import software.constructs.Construct

public fun Construct.cfnView(
  id: String,
  props: CfnViewProps,
  initializer: CfnView.() -> Unit = {},
): CfnView = CfnView(this, id, props).apply(initializer)
