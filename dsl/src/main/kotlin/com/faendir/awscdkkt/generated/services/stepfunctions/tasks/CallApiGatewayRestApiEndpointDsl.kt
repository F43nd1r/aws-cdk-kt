package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.callApiGatewayRestApiEndpoint(
  id: String,
  props: CallApiGatewayRestApiEndpointProps,
  initializer: @AwsCdkDsl CallApiGatewayRestApiEndpoint.() -> Unit = {},
): CallApiGatewayRestApiEndpoint = CallApiGatewayRestApiEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCallApiGatewayRestApiEndpoint(id: String, initializer: @AwsCdkDsl CallApiGatewayRestApiEndpoint.Builder.() -> Unit = {}): CallApiGatewayRestApiEndpoint = CallApiGatewayRestApiEndpoint.Builder.create(this, id).apply(initializer).build()
