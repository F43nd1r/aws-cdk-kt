package com.faendir.awscdkkt.generated.services.rtbfabric

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rtbfabric.CfnInboundExternalLink
import software.amazon.awscdk.services.rtbfabric.CfnInboundExternalLinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInboundExternalLink(
  id: String,
  props: CfnInboundExternalLinkProps,
  initializer: @AwsCdkDsl CfnInboundExternalLink.() -> Unit = {},
): CfnInboundExternalLink = CfnInboundExternalLink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInboundExternalLink(id: String, initializer: @AwsCdkDsl CfnInboundExternalLink.Builder.() -> Unit = {}): CfnInboundExternalLink = CfnInboundExternalLink.Builder.create(this, id).apply(initializer).build()
