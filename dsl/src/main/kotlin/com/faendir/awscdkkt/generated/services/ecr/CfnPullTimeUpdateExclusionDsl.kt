package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnPullTimeUpdateExclusion
import software.amazon.awscdk.services.ecr.CfnPullTimeUpdateExclusionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPullTimeUpdateExclusion(
  id: String,
  props: CfnPullTimeUpdateExclusionProps,
  initializer: @AwsCdkDsl CfnPullTimeUpdateExclusion.() -> Unit = {},
): CfnPullTimeUpdateExclusion = CfnPullTimeUpdateExclusion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPullTimeUpdateExclusion(id: String, initializer: @AwsCdkDsl CfnPullTimeUpdateExclusion.Builder.() -> Unit = {}): CfnPullTimeUpdateExclusion = CfnPullTimeUpdateExclusion.Builder.create(this, id).apply(initializer).build()
