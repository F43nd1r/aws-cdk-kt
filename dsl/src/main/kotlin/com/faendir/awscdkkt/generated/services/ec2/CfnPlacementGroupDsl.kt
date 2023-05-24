package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnPlacementGroup
import software.amazon.awscdk.services.ec2.CfnPlacementGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlacementGroup(id: String): CfnPlacementGroup = CfnPlacementGroup(this, id)

@Generated
public fun Construct.cfnPlacementGroup(id: String, initializer: @AwsCdkDsl
    CfnPlacementGroup.() -> Unit): CfnPlacementGroup = CfnPlacementGroup(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnPlacementGroup(id: String, props: CfnPlacementGroupProps): CfnPlacementGroup
    = CfnPlacementGroup(this, id, props)

@Generated
public fun Construct.cfnPlacementGroup(
  id: String,
  props: CfnPlacementGroupProps,
  initializer: @AwsCdkDsl CfnPlacementGroup.() -> Unit,
): CfnPlacementGroup = CfnPlacementGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPlacementGroup(id: String, initializer: @AwsCdkDsl
    CfnPlacementGroup.Builder.() -> Unit): CfnPlacementGroup =
    CfnPlacementGroup.Builder.create(this, id).apply(initializer).build()
