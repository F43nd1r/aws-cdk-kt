package com.faendir.awscdkkt.generated.services.amplifyuibuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComponent(
  id: String,
  props: CfnComponentProps,
  initializer: @AwsCdkDsl CfnComponent.() -> Unit = {},
): CfnComponent = CfnComponent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnComponent(id: String, initializer: @AwsCdkDsl
    CfnComponent.Builder.() -> Unit = {}): CfnComponent = CfnComponent.Builder.create(this,
    id).apply(initializer).build()
