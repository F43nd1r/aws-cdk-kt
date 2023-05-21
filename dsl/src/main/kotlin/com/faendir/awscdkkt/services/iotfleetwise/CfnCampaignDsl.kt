package com.faendir.awscdkkt.services.iotfleetwise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCampaign(
  id: String,
  props: CfnCampaignProps,
  initializer: CfnCampaign.() -> Unit = {},
): CfnCampaign = CfnCampaign(this, id, props).apply(initializer)
