@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
