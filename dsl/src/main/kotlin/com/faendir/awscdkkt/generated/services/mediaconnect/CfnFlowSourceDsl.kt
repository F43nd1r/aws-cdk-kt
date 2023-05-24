package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowSource(id: String, props: CfnFlowSourceProps): CfnFlowSource =
    CfnFlowSource(this, id, props)

@Generated
public fun Construct.cfnFlowSource(
  id: String,
  props: CfnFlowSourceProps,
  initializer: @AwsCdkDsl CfnFlowSource.() -> Unit,
): CfnFlowSource = CfnFlowSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlowSource(id: String, initializer: @AwsCdkDsl
    CfnFlowSource.Builder.() -> Unit): CfnFlowSource = CfnFlowSource.Builder.create(this,
    id).apply(initializer).build()
