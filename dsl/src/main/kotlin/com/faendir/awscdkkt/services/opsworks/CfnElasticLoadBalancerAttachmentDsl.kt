package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnElasticLoadBalancerAttachment(
  id: String,
  props: CfnElasticLoadBalancerAttachmentProps,
  initializer: CfnElasticLoadBalancerAttachment.() -> Unit = {},
): CfnElasticLoadBalancerAttachment = CfnElasticLoadBalancerAttachment(this, id,
    props).apply(initializer)
