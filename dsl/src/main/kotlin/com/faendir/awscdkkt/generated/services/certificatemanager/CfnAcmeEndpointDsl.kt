package com.faendir.awscdkkt.generated.services.certificatemanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnAcmeEndpoint
import software.amazon.awscdk.services.certificatemanager.CfnAcmeEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAcmeEndpoint(
  id: String,
  props: CfnAcmeEndpointProps,
  initializer: @AwsCdkDsl CfnAcmeEndpoint.() -> Unit = {},
): CfnAcmeEndpoint = CfnAcmeEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAcmeEndpoint(id: String, initializer: @AwsCdkDsl CfnAcmeEndpoint.Builder.() -> Unit = {}): CfnAcmeEndpoint = CfnAcmeEndpoint.Builder.create(this, id).apply(initializer).build()
