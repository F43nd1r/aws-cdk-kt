@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnLink
import software.amazon.awscdk.services.networkmanager.CfnLinkProps
import software.constructs.Construct

public fun Construct.cfnLink(
  id: String,
  props: CfnLinkProps,
  initializer: CfnLink.() -> Unit = {},
): CfnLink = CfnLink(this, id, props).apply(initializer)
