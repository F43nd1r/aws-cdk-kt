package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMultiRegionEndpoint
import software.amazon.awscdk.services.ses.CfnMultiRegionEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMultiRegionEndpoint(
  id: String,
  props: CfnMultiRegionEndpointProps,
  initializer: @AwsCdkDsl CfnMultiRegionEndpoint.() -> Unit = {},
): CfnMultiRegionEndpoint = CfnMultiRegionEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMultiRegionEndpoint(id: String, initializer: @AwsCdkDsl CfnMultiRegionEndpoint.Builder.() -> Unit = {}): CfnMultiRegionEndpoint = CfnMultiRegionEndpoint.Builder.create(this, id).apply(initializer).build()
