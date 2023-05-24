package com.faendir.awscdkkt.generated.services.groundstation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataflowEndpointGroup(id: String, props: CfnDataflowEndpointGroupProps):
    CfnDataflowEndpointGroup = CfnDataflowEndpointGroup(this, id, props)

@Generated
public fun Construct.cfnDataflowEndpointGroup(
  id: String,
  props: CfnDataflowEndpointGroupProps,
  initializer: @AwsCdkDsl CfnDataflowEndpointGroup.() -> Unit,
): CfnDataflowEndpointGroup = CfnDataflowEndpointGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataflowEndpointGroup(id: String, initializer: @AwsCdkDsl
    CfnDataflowEndpointGroup.Builder.() -> Unit): CfnDataflowEndpointGroup =
    CfnDataflowEndpointGroup.Builder.create(this, id).apply(initializer).build()
