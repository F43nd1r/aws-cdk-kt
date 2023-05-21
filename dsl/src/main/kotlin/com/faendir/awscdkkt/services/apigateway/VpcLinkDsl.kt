package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.VpcLink
import software.amazon.awscdk.services.apigateway.VpcLinkProps
import software.constructs.Construct

@Generated
public fun Construct.vpcLink(id: String, initializer: VpcLink.() -> Unit = {}): VpcLink =
    VpcLink(this, id).apply(initializer)

@Generated
public fun Construct.vpcLink(
  id: String,
  props: VpcLinkProps,
  initializer: VpcLink.() -> Unit = {},
): VpcLink = VpcLink(this, id, props).apply(initializer)
