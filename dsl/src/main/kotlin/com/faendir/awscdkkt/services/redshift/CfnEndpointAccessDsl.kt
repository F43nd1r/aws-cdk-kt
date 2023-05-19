@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
