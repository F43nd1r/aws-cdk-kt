package com.faendir.awscdkkt.generated.services.oam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.oam.CfnLink
import software.amazon.awscdk.services.oam.CfnLinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLink(id: String, props: CfnLinkProps): CfnLink = CfnLink(this, id, props)

@Generated
public fun Construct.cfnLink(
  id: String,
  props: CfnLinkProps,
  initializer: @AwsCdkDsl CfnLink.() -> Unit,
): CfnLink = CfnLink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLink(id: String, initializer: @AwsCdkDsl CfnLink.Builder.() -> Unit):
    CfnLink = CfnLink.Builder.create(this, id).apply(initializer).build()
