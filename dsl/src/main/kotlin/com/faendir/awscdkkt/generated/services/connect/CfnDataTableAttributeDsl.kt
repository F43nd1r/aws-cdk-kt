package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnDataTableAttribute
import software.amazon.awscdk.services.connect.CfnDataTableAttributeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataTableAttribute(id: String, initializer: @AwsCdkDsl CfnDataTableAttribute.() -> Unit = {}): CfnDataTableAttribute = CfnDataTableAttribute(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataTableAttribute(
  id: String,
  props: CfnDataTableAttributeProps,
  initializer: @AwsCdkDsl CfnDataTableAttribute.() -> Unit = {},
): CfnDataTableAttribute = CfnDataTableAttribute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataTableAttribute(id: String, initializer: @AwsCdkDsl CfnDataTableAttribute.Builder.() -> Unit = {}): CfnDataTableAttribute = CfnDataTableAttribute.Builder.create(this, id).apply(initializer).build()
