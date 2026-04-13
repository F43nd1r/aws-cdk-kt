package com.faendir.awscdkkt.generated.services.securityagent

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityagent.CfnTargetDomain
import software.amazon.awscdk.services.securityagent.CfnTargetDomainProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTargetDomain(
  id: String,
  props: CfnTargetDomainProps,
  initializer: @AwsCdkDsl CfnTargetDomain.() -> Unit = {},
): CfnTargetDomain = CfnTargetDomain(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTargetDomain(id: String, initializer: @AwsCdkDsl CfnTargetDomain.Builder.() -> Unit = {}): CfnTargetDomain = CfnTargetDomain.Builder.create(this, id).apply(initializer).build()
