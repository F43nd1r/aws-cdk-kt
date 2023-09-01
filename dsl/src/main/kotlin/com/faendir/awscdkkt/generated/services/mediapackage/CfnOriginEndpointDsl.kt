package com.faendir.awscdkkt.generated.services.mediapackage

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps
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
