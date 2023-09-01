package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroup
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserHierarchyGroup(
  id: String,
  props: CfnUserHierarchyGroupProps,
  initializer: @AwsCdkDsl CfnUserHierarchyGroup.() -> Unit = {},
): CfnUserHierarchyGroup = CfnUserHierarchyGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserHierarchyGroup(id: String, initializer: @AwsCdkDsl
    CfnUserHierarchyGroup.Builder.() -> Unit = {}): CfnUserHierarchyGroup =
    CfnUserHierarchyGroup.Builder.create(this, id).apply(initializer).build()
