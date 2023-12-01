package com.faendir.awscdkkt.generated.services.mediapackagev2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOriginEndpoint(
  id: String,
  props: CfnOriginEndpointProps,
  initializer: @AwsCdkDsl CfnOriginEndpoint.() -> Unit = {},
): CfnOriginEndpoint = CfnOriginEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOriginEndpoint(id: String, initializer: @AwsCdkDsl
    CfnOriginEndpoint.Builder.() -> Unit = {}): CfnOriginEndpoint =
    CfnOriginEndpoint.Builder.create(this, id).apply(initializer).build()
