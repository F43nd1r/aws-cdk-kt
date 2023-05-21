package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInsightsPath(
  id: String,
  props: CfnNetworkInsightsPathProps,
  initializer: CfnNetworkInsightsPath.() -> Unit = {},
): CfnNetworkInsightsPath = CfnNetworkInsightsPath(this, id, props).apply(initializer)
