@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.oam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.oam.CfnLink
import software.amazon.awscdk.services.oam.CfnLinkProps
import software.constructs.Construct

public fun Construct.cfnLink(
  id: String,
  props: CfnLinkProps,
  initializer: CfnLink.() -> Unit = {},
): CfnLink = CfnLink(this, id, props).apply(initializer)
