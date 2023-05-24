package com.faendir.awscdkkt.generated.services.detective

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.detective.CfnGraph
import software.amazon.awscdk.services.detective.CfnGraphProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGraph(id: String): CfnGraph = CfnGraph(this, id)

@Generated
public fun Construct.cfnGraph(id: String, initializer: @AwsCdkDsl CfnGraph.() -> Unit): CfnGraph =
    CfnGraph(this, id).apply(initializer)

@Generated
public fun Construct.cfnGraph(id: String, props: CfnGraphProps): CfnGraph = CfnGraph(this, id,
    props)

@Generated
public fun Construct.cfnGraph(
  id: String,
  props: CfnGraphProps,
  initializer: @AwsCdkDsl CfnGraph.() -> Unit,
): CfnGraph = CfnGraph(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGraph(id: String, initializer: @AwsCdkDsl CfnGraph.Builder.() -> Unit):
    CfnGraph = CfnGraph.Builder.create(this, id).apply(initializer).build()
