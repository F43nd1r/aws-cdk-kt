package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnPublishingDestination
import software.amazon.awscdk.services.guardduty.CfnPublishingDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublishingDestination(
  id: String,
  props: CfnPublishingDestinationProps,
  initializer: @AwsCdkDsl CfnPublishingDestination.() -> Unit = {},
): CfnPublishingDestination = CfnPublishingDestination(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPublishingDestination(id: String, initializer: @AwsCdkDsl CfnPublishingDestination.Builder.() -> Unit = {}): CfnPublishingDestination = CfnPublishingDestination.Builder.create(this, id).apply(initializer).build()
