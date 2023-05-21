package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import software.amazon.awscdk.services.pinpoint.CfnCampaignProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCampaign(
  id: String,
  props: CfnCampaignProps,
  initializer: CfnCampaign.() -> Unit = {},
): CfnCampaign = CfnCampaign(this, id, props).apply(initializer)
