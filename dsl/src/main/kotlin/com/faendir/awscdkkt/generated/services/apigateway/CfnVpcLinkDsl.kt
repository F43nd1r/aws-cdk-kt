package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnVpcLink
import software.amazon.awscdk.services.apigateway.CfnVpcLinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcLink(id: String, props: CfnVpcLinkProps): CfnVpcLink = CfnVpcLink(this,
    id, props)

@Generated
public fun Construct.cfnVpcLink(
  id: String,
  props: CfnVpcLinkProps,
  initializer: @AwsCdkDsl CfnVpcLink.() -> Unit,
): CfnVpcLink = CfnVpcLink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVpcLink(id: String, initializer: @AwsCdkDsl
    CfnVpcLink.Builder.() -> Unit): CfnVpcLink = CfnVpcLink.Builder.create(this,
    id).apply(initializer).build()
