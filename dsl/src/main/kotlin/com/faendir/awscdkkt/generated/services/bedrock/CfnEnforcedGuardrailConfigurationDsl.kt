package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnEnforcedGuardrailConfiguration
import software.amazon.awscdk.services.bedrock.CfnEnforcedGuardrailConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnforcedGuardrailConfiguration(
  id: String,
  props: CfnEnforcedGuardrailConfigurationProps,
  initializer: @AwsCdkDsl CfnEnforcedGuardrailConfiguration.() -> Unit = {},
): CfnEnforcedGuardrailConfiguration = CfnEnforcedGuardrailConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnforcedGuardrailConfiguration(id: String, initializer: @AwsCdkDsl CfnEnforcedGuardrailConfiguration.Builder.() -> Unit = {}): CfnEnforcedGuardrailConfiguration = CfnEnforcedGuardrailConfiguration.Builder.create(this, id).apply(initializer).build()
