package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnUserHierarchyStructure
import software.amazon.awscdk.services.connect.CfnUserHierarchyStructureProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserHierarchyStructure(
  id: String,
  props: CfnUserHierarchyStructureProps,
  initializer: @AwsCdkDsl CfnUserHierarchyStructure.() -> Unit = {},
): CfnUserHierarchyStructure = CfnUserHierarchyStructure(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserHierarchyStructure(id: String, initializer: @AwsCdkDsl CfnUserHierarchyStructure.Builder.() -> Unit = {}): CfnUserHierarchyStructure = CfnUserHierarchyStructure.Builder.create(this, id).apply(initializer).build()
