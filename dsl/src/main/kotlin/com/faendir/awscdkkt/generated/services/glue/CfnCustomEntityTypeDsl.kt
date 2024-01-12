package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCustomEntityType
import software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomEntityType(id: String, initializer: @AwsCdkDsl
    CfnCustomEntityType.() -> Unit = {}): CfnCustomEntityType = CfnCustomEntityType(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnCustomEntityType(
  id: String,
  props: CfnCustomEntityTypeProps,
  initializer: @AwsCdkDsl CfnCustomEntityType.() -> Unit = {},
): CfnCustomEntityType = CfnCustomEntityType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomEntityType(id: String, initializer: @AwsCdkDsl
    CfnCustomEntityType.Builder.() -> Unit = {}): CfnCustomEntityType =
    CfnCustomEntityType.Builder.create(this, id).apply(initializer).build()
