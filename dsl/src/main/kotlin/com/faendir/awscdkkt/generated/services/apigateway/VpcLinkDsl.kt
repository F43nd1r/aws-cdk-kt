package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.VpcLink
import software.amazon.awscdk.services.apigateway.VpcLinkProps
import software.constructs.Construct

@Generated
public fun Construct.vpcLink(id: String, initializer: @AwsCdkDsl VpcLink.() -> Unit = {}): VpcLink = VpcLink(this, id).apply(initializer)

@Generated
public fun Construct.vpcLink(
  id: String,
  props: VpcLinkProps,
  initializer: @AwsCdkDsl VpcLink.() -> Unit = {},
): VpcLink = VpcLink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVpcLink(id: String, initializer: @AwsCdkDsl VpcLink.Builder.() -> Unit = {}): VpcLink = VpcLink.Builder.create(this, id).apply(initializer).build()
