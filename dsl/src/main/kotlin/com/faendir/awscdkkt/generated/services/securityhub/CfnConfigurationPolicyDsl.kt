package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy
import software.amazon.awscdk.services.securityhub.CfnConfigurationPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationPolicy(
  id: String,
  props: CfnConfigurationPolicyProps,
  initializer: @AwsCdkDsl CfnConfigurationPolicy.() -> Unit = {},
): CfnConfigurationPolicy = CfnConfigurationPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationPolicy(id: String, initializer: @AwsCdkDsl CfnConfigurationPolicy.Builder.() -> Unit = {}): CfnConfigurationPolicy = CfnConfigurationPolicy.Builder.create(this, id).apply(initializer).build()
