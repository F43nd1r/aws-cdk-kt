package com.faendir.awscdkkt.generated.services.resiliencehubv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehubv2.CfnUserJourney
import software.amazon.awscdk.services.resiliencehubv2.CfnUserJourneyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserJourney(
  id: String,
  props: CfnUserJourneyProps,
  initializer: @AwsCdkDsl CfnUserJourney.() -> Unit = {},
): CfnUserJourney = CfnUserJourney(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserJourney(id: String, initializer: @AwsCdkDsl CfnUserJourney.Builder.() -> Unit = {}): CfnUserJourney = CfnUserJourney.Builder.create(this, id).apply(initializer).build()
