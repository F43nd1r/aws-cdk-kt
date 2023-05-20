@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps
import software.constructs.Construct

public fun Construct.cfnOriginEndpoint(
  id: String,
  props: CfnOriginEndpointProps,
  initializer: CfnOriginEndpoint.() -> Unit = {},
): CfnOriginEndpoint = CfnOriginEndpoint(this, id, props).apply(initializer)
