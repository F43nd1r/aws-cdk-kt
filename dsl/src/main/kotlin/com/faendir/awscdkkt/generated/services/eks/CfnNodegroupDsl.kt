package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup
import software.amazon.awscdk.services.eks.CfnNodegroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNodegroup(id: String, props: CfnNodegroupProps): CfnNodegroup =
    CfnNodegroup(this, id, props)

@Generated
public fun Construct.cfnNodegroup(
  id: String,
  props: CfnNodegroupProps,
  initializer: @AwsCdkDsl CfnNodegroup.() -> Unit,
): CfnNodegroup = CfnNodegroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNodegroup(id: String, initializer: @AwsCdkDsl
    CfnNodegroup.Builder.() -> Unit): CfnNodegroup = CfnNodegroup.Builder.create(this,
    id).apply(initializer).build()
