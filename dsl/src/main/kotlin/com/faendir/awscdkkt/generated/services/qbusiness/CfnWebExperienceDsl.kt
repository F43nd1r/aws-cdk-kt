package com.faendir.awscdkkt.generated.services.qbusiness

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qbusiness.CfnWebExperience
import software.amazon.awscdk.services.qbusiness.CfnWebExperienceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWebExperience(
  id: String,
  props: CfnWebExperienceProps,
  initializer: @AwsCdkDsl CfnWebExperience.() -> Unit = {},
): CfnWebExperience = CfnWebExperience(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWebExperience(id: String, initializer: @AwsCdkDsl CfnWebExperience.Builder.() -> Unit = {}): CfnWebExperience = CfnWebExperience.Builder.create(this, id).apply(initializer).build()
