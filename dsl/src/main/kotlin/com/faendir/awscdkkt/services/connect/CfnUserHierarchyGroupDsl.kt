package com.faendir.awscdkkt.services.connect

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
  initializer: CfnUserHierarchyGroup.() -> Unit = {},
): CfnUserHierarchyGroup = CfnUserHierarchyGroup(this, id, props).apply(initializer)
