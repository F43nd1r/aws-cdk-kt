package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnLimitsProfile
import software.amazon.awscdk.services.quicksight.CfnLimitsProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLimitsProfile(
  id: String,
  props: CfnLimitsProfileProps,
  initializer: @AwsCdkDsl CfnLimitsProfile.() -> Unit = {},
): CfnLimitsProfile = CfnLimitsProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLimitsProfile(id: String, initializer: @AwsCdkDsl CfnLimitsProfile.Builder.() -> Unit = {}): CfnLimitsProfile = CfnLimitsProfile.Builder.create(this, id).apply(initializer).build()
