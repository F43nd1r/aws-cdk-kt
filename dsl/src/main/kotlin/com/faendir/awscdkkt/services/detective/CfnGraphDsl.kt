@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.detective

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.detective.CfnGraph
import software.amazon.awscdk.services.detective.CfnGraphProps
import software.constructs.Construct

public fun Construct.cfnGraph(id: String, initializer: CfnGraph.() -> Unit = {}): CfnGraph =
    CfnGraph(this, id).apply(initializer)

public fun Construct.cfnGraph(
  id: String,
  props: CfnGraphProps,
  initializer: CfnGraph.() -> Unit = {},
): CfnGraph = CfnGraph(this, id, props).apply(initializer)
