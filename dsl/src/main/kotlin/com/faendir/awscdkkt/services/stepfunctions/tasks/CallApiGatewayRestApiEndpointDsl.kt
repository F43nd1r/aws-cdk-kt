@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointProps
import software.constructs.Construct

public fun Construct.callApiGatewayRestApiEndpoint(
  id: String,
  props: CallApiGatewayRestApiEndpointProps,
  initializer: CallApiGatewayRestApiEndpoint.() -> Unit = {},
): CallApiGatewayRestApiEndpoint = CallApiGatewayRestApiEndpoint(this, id, props).apply(initializer)
