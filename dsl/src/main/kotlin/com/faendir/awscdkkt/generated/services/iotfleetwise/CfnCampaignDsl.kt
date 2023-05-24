package com.faendir.awscdkkt.generated.services.iotfleetwise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCampaign(id: String, props: CfnCampaignProps): CfnCampaign =
    CfnCampaign(this, id, props)

@Generated
public fun Construct.cfnCampaign(
  id: String,
  props: CfnCampaignProps,
  initializer: @AwsCdkDsl CfnCampaign.() -> Unit,
): CfnCampaign = CfnCampaign(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCampaign(id: String, initializer: @AwsCdkDsl
    CfnCampaign.Builder.() -> Unit): CfnCampaign = CfnCampaign.Builder.create(this,
    id).apply(initializer).build()
