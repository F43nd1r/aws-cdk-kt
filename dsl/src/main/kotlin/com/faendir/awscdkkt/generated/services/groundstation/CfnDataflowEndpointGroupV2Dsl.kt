package com.faendir.awscdkkt.generated.services.groundstation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupV2
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnDataflowEndpointGroupV2(id: String, initializer: @AwsCdkDsl CfnDataflowEndpointGroupV2.() -> Unit = {}): CfnDataflowEndpointGroupV2 = CfnDataflowEndpointGroupV2(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataflowEndpointGroupV2(
  id: String,
  props: CfnDataflowEndpointGroupV2Props,
  initializer: @AwsCdkDsl CfnDataflowEndpointGroupV2.() -> Unit = {},
): CfnDataflowEndpointGroupV2 = CfnDataflowEndpointGroupV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataflowEndpointGroupV2(id: String, initializer: @AwsCdkDsl CfnDataflowEndpointGroupV2.Builder.() -> Unit = {}): CfnDataflowEndpointGroupV2 = CfnDataflowEndpointGroupV2.Builder.create(this, id).apply(initializer).build()
