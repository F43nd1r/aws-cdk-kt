package com.faendir.awscdkkt.generated.services.controlcatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controlcatalog.CfnCommonControl
import software.amazon.awscdk.services.controlcatalog.CfnCommonControlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCommonControl(id: String, initializer: @AwsCdkDsl CfnCommonControl.() -> Unit = {}): CfnCommonControl = CfnCommonControl(this, id).apply(initializer)

@Generated
public fun Construct.cfnCommonControl(
  id: String,
  props: CfnCommonControlProps,
  initializer: @AwsCdkDsl CfnCommonControl.() -> Unit = {},
): CfnCommonControl = CfnCommonControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCommonControl(id: String, initializer: @AwsCdkDsl CfnCommonControl.Builder.() -> Unit = {}): CfnCommonControl = CfnCommonControl.Builder.create(this, id).apply(initializer).build()
