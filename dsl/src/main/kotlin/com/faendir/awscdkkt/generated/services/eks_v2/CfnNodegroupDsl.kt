package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.CfnNodegroup
import software.amazon.awscdk.services.eks_v2.CfnNodegroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNodegroup(
  id: String,
  props: CfnNodegroupProps,
  initializer: @AwsCdkDsl CfnNodegroup.() -> Unit = {},
): CfnNodegroup = CfnNodegroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNodegroup(id: String, initializer: @AwsCdkDsl CfnNodegroup.Builder.() -> Unit = {}): CfnNodegroup = CfnNodegroup.Builder.create(this, id).apply(initializer).build()
