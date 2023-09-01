package com.faendir.awscdkkt.generated.services.iottwinmaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnEntity
import software.amazon.awscdk.services.iottwinmaker.CfnEntityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEntity(
  id: String,
  props: CfnEntityProps,
  initializer: @AwsCdkDsl CfnEntity.() -> Unit = {},
): CfnEntity = CfnEntity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEntity(id: String, initializer: @AwsCdkDsl CfnEntity.Builder.() -> Unit
    = {}): CfnEntity = CfnEntity.Builder.create(this, id).apply(initializer).build()
