package com.faendir.awscdkkt.generated.services.redshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorization
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEndpointAuthorization(
  id: String,
  props: CfnEndpointAuthorizationProps,
  initializer: @AwsCdkDsl CfnEndpointAuthorization.() -> Unit = {},
): CfnEndpointAuthorization = CfnEndpointAuthorization(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEndpointAuthorization(id: String, initializer: @AwsCdkDsl
    CfnEndpointAuthorization.Builder.() -> Unit = {}): CfnEndpointAuthorization =
    CfnEndpointAuthorization.Builder.create(this, id).apply(initializer).build()
