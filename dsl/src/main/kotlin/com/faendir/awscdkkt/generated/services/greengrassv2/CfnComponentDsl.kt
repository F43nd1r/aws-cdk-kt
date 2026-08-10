package com.faendir.awscdkkt.generated.services.greengrassv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponent
import software.amazon.awscdk.services.greengrassv2.CfnComponentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComponent(id: String, initializer: @AwsCdkDsl CfnComponent.() -> Unit = {}): CfnComponent = CfnComponent(this, id).apply(initializer)

@Generated
public fun Construct.cfnComponent(
  id: String,
  props: CfnComponentProps,
  initializer: @AwsCdkDsl CfnComponent.() -> Unit = {},
): CfnComponent = CfnComponent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnComponent(id: String, initializer: @AwsCdkDsl CfnComponent.Builder.() -> Unit = {}): CfnComponent = CfnComponent.Builder.create(this, id).apply(initializer).build()
