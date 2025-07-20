package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnNetworkInsightsPath.() -> Unit = {},
): CfnNetworkInsightsPath = CfnNetworkInsightsPath(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkInsightsPath(id: String, initializer: @AwsCdkDsl CfnNetworkInsightsPath.Builder.() -> Unit = {}): CfnNetworkInsightsPath = CfnNetworkInsightsPath.Builder.create(this, id).apply(initializer).build()
