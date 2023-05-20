@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAccess
import software.amazon.awscdk.services.redshift.CfnEndpointAccessProps
import software.constructs.Construct

public fun Construct.cfnEndpointAccess(
  id: String,
  props: CfnEndpointAccessProps,
  initializer: CfnEndpointAccess.() -> Unit = {},
): CfnEndpointAccess = CfnEndpointAccess(this, id, props).apply(initializer)
