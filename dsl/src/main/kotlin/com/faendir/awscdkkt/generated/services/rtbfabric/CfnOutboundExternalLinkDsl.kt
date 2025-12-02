package com.faendir.awscdkkt.generated.services.rtbfabric

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rtbfabric.CfnOutboundExternalLink
import software.amazon.awscdk.services.rtbfabric.CfnOutboundExternalLinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOutboundExternalLink(
  id: String,
  props: CfnOutboundExternalLinkProps,
  initializer: @AwsCdkDsl CfnOutboundExternalLink.() -> Unit = {},
): CfnOutboundExternalLink = CfnOutboundExternalLink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOutboundExternalLink(id: String, initializer: @AwsCdkDsl CfnOutboundExternalLink.Builder.() -> Unit = {}): CfnOutboundExternalLink = CfnOutboundExternalLink.Builder.create(this, id).apply(initializer).build()
