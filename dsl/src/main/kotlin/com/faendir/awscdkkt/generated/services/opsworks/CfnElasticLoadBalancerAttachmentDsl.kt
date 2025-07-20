package com.faendir.awscdkkt.generated.services.opsworks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnElasticLoadBalancerAttachment.() -> Unit = {},
): CfnElasticLoadBalancerAttachment = CfnElasticLoadBalancerAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnElasticLoadBalancerAttachment(id: String, initializer: @AwsCdkDsl CfnElasticLoadBalancerAttachment.Builder.() -> Unit = {}): CfnElasticLoadBalancerAttachment = CfnElasticLoadBalancerAttachment.Builder.create(this, id).apply(initializer).build()
