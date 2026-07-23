package com.faendir.awscdkkt.generated.services.controlcatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controlcatalog.CfnControl
import software.amazon.awscdk.services.controlcatalog.CfnControlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnControl(id: String, initializer: @AwsCdkDsl CfnControl.() -> Unit = {}): CfnControl = CfnControl(this, id).apply(initializer)

@Generated
public fun Construct.cfnControl(
  id: String,
  props: CfnControlProps,
  initializer: @AwsCdkDsl CfnControl.() -> Unit = {},
): CfnControl = CfnControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnControl(id: String, initializer: @AwsCdkDsl CfnControl.Builder.() -> Unit = {}): CfnControl = CfnControl.Builder.create(this, id).apply(initializer).build()
