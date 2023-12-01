package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.VpcLink
import software.amazon.awscdk.services.apigatewayv2.VpcLinkProps
import software.constructs.Construct

@Generated
public fun Construct.vpcLink(
  id: String,
  props: VpcLinkProps,
  initializer: @AwsCdkDsl VpcLink.() -> Unit = {},
): VpcLink = VpcLink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVpcLink(id: String, initializer: @AwsCdkDsl VpcLink.Builder.() -> Unit =
    {}): VpcLink = VpcLink.Builder.create(this, id).apply(initializer).build()
