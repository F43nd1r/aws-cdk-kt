@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointProps
import software.constructs.Construct

public fun Construct.callApiGatewayHttpApiEndpoint(
  id: String,
  props: CallApiGatewayHttpApiEndpointProps,
  initializer: CallApiGatewayHttpApiEndpoint.() -> Unit = {},
): CallApiGatewayHttpApiEndpoint = CallApiGatewayHttpApiEndpoint(this, id, props).apply(initializer)
