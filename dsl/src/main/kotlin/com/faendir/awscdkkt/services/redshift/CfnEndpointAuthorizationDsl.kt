@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorization
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps
import software.constructs.Construct

public fun Construct.cfnEndpointAuthorization(
  id: String,
  props: CfnEndpointAuthorizationProps,
  initializer: CfnEndpointAuthorization.() -> Unit = {},
): CfnEndpointAuthorization = CfnEndpointAuthorization(this, id, props).apply(initializer)
