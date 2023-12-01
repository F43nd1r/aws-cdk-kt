package com.faendir.awscdkkt.generated.services.shield

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.shield.CfnProactiveEngagement
import software.amazon.awscdk.services.shield.CfnProactiveEngagementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProactiveEngagement(
  id: String,
  props: CfnProactiveEngagementProps,
  initializer: @AwsCdkDsl CfnProactiveEngagement.() -> Unit = {},
): CfnProactiveEngagement = CfnProactiveEngagement(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProactiveEngagement(id: String, initializer: @AwsCdkDsl
    CfnProactiveEngagement.Builder.() -> Unit = {}): CfnProactiveEngagement =
    CfnProactiveEngagement.Builder.create(this, id).apply(initializer).build()
