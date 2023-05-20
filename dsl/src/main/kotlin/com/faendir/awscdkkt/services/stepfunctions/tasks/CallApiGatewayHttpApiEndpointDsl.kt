@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
