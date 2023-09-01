package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppBlockBuilder(
  id: String,
  props: CfnAppBlockBuilderProps,
  initializer: @AwsCdkDsl CfnAppBlockBuilder.() -> Unit = {},
): CfnAppBlockBuilder = CfnAppBlockBuilder(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAppBlockBuilder(id: String, initializer: @AwsCdkDsl
    CfnAppBlockBuilder.Builder.() -> Unit = {}): CfnAppBlockBuilder =
    CfnAppBlockBuilder.Builder.create(this, id).apply(initializer).build()
