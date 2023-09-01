package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.callApiGatewayHttpApiEndpoint(
  id: String,
  props: CallApiGatewayHttpApiEndpointProps,
  initializer: @AwsCdkDsl CallApiGatewayHttpApiEndpoint.() -> Unit = {},
): CallApiGatewayHttpApiEndpoint = CallApiGatewayHttpApiEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCallApiGatewayHttpApiEndpoint(id: String, initializer: @AwsCdkDsl
    CallApiGatewayHttpApiEndpoint.Builder.() -> Unit = {}): CallApiGatewayHttpApiEndpoint =
    CallApiGatewayHttpApiEndpoint.Builder.create(this, id).apply(initializer).build()
