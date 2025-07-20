package com.faendir.awscdkkt.generated.services.iottwinmaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComponentType(
  id: String,
  props: CfnComponentTypeProps,
  initializer: @AwsCdkDsl CfnComponentType.() -> Unit = {},
): CfnComponentType = CfnComponentType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnComponentType(id: String, initializer: @AwsCdkDsl CfnComponentType.Builder.() -> Unit = {}): CfnComponentType = CfnComponentType.Builder.create(this, id).apply(initializer).build()
