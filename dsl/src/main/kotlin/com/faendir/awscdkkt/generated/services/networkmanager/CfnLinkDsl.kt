package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnLink
import software.amazon.awscdk.services.networkmanager.CfnLinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLink(
  id: String,
  props: CfnLinkProps,
  initializer: @AwsCdkDsl CfnLink.() -> Unit = {},
): CfnLink = CfnLink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLink(id: String, initializer: @AwsCdkDsl CfnLink.Builder.() -> Unit =
    {}): CfnLink = CfnLink.Builder.create(this, id).apply(initializer).build()
