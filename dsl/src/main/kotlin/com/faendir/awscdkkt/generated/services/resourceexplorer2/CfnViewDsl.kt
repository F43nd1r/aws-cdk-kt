package com.faendir.awscdkkt.generated.services.resourceexplorer2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourceexplorer2.CfnView
import software.amazon.awscdk.services.resourceexplorer2.CfnViewProps
import software.constructs.Construct

@Generated
public fun Construct.cfnView(id: String, props: CfnViewProps): CfnView = CfnView(this, id, props)

@Generated
public fun Construct.cfnView(
  id: String,
  props: CfnViewProps,
  initializer: @AwsCdkDsl CfnView.() -> Unit,
): CfnView = CfnView(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnView(id: String, initializer: @AwsCdkDsl CfnView.Builder.() -> Unit):
    CfnView = CfnView.Builder.create(this, id).apply(initializer).build()
