package com.faendir.awscdkkt.generated.services.qbusiness

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qbusiness.CfnPlugin
import software.amazon.awscdk.services.qbusiness.CfnPluginProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlugin(
  id: String,
  props: CfnPluginProps,
  initializer: @AwsCdkDsl CfnPlugin.() -> Unit = {},
): CfnPlugin = CfnPlugin(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPlugin(id: String, initializer: @AwsCdkDsl CfnPlugin.Builder.() -> Unit = {}): CfnPlugin = CfnPlugin.Builder.create(this, id).apply(initializer).build()
