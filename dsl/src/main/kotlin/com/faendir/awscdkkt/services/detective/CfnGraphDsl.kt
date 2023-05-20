@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.detective

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.detective.CfnGraph
import software.amazon.awscdk.services.detective.CfnGraphProps
import software.constructs.Construct

public fun Construct.cfnGraph(
  id: String,
  props: CfnGraphProps,
  initializer: CfnGraph.() -> Unit = {},
): CfnGraph = CfnGraph(this, id, props).apply(initializer)

public fun Construct.cfnGraph(id: String, initializer: CfnGraph.() -> Unit = {}): CfnGraph =
    CfnGraph(this, id).apply(initializer)
