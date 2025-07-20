package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.Nodegroup
import software.amazon.awscdk.services.eks.NodegroupProps
import software.constructs.Construct

@Generated
public fun Construct.nodegroup(
  id: String,
  props: NodegroupProps,
  initializer: @AwsCdkDsl Nodegroup.() -> Unit = {},
): Nodegroup = Nodegroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNodegroup(id: String, initializer: @AwsCdkDsl Nodegroup.Builder.() -> Unit = {}): Nodegroup = Nodegroup.Builder.create(this, id).apply(initializer).build()
