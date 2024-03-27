package com.faendir.awscdkkt.generated.services.kafkaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin
import software.amazon.awscdk.services.kafkaconnect.CfnCustomPluginProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomPlugin(
  id: String,
  props: CfnCustomPluginProps,
  initializer: @AwsCdkDsl CfnCustomPlugin.() -> Unit = {},
): CfnCustomPlugin = CfnCustomPlugin(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomPlugin(id: String, initializer: @AwsCdkDsl
    CfnCustomPlugin.Builder.() -> Unit = {}): CfnCustomPlugin = CfnCustomPlugin.Builder.create(this,
    id).apply(initializer).build()
