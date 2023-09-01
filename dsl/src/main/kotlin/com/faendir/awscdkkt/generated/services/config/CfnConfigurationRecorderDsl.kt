package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationRecorder(
  id: String,
  props: CfnConfigurationRecorderProps,
  initializer: @AwsCdkDsl CfnConfigurationRecorder.() -> Unit = {},
): CfnConfigurationRecorder = CfnConfigurationRecorder(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationRecorder(id: String, initializer: @AwsCdkDsl
    CfnConfigurationRecorder.Builder.() -> Unit = {}): CfnConfigurationRecorder =
    CfnConfigurationRecorder.Builder.create(this, id).apply(initializer).build()
