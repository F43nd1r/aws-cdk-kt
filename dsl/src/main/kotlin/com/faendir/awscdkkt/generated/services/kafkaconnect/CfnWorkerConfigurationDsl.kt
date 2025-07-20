package com.faendir.awscdkkt.generated.services.kafkaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration
import software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkerConfiguration(
  id: String,
  props: CfnWorkerConfigurationProps,
  initializer: @AwsCdkDsl CfnWorkerConfiguration.() -> Unit = {},
): CfnWorkerConfiguration = CfnWorkerConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkerConfiguration(id: String, initializer: @AwsCdkDsl CfnWorkerConfiguration.Builder.() -> Unit = {}): CfnWorkerConfiguration = CfnWorkerConfiguration.Builder.create(this, id).apply(initializer).build()
